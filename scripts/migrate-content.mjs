import { mkdirSync, readdirSync, readFileSync, rmSync, writeFileSync, cpSync } from 'fs'
import { dirname, join, basename } from 'path'

const root = process.cwd()

function ensureDir(p) { try { mkdirSync(p, { recursive: true }) } catch {} }

// Clean old generated content dirs
ensureDir(join(root, 'src/content/questions'))
ensureDir(join(root, 'src/code'))
ensureDir(join(root, 'src/data'))

// Copy data YAML
cpSync(join(root, '_data/languages.yml'), join(root, 'src/data/languages.yml'))
cpSync(join(root, '_data/companies.yml'), join(root, 'src/data/companies.yml'))
cpSync(join(root, '_data/difficulties.yml'), join(root, 'src/data/difficulties.yml'))

// Migrate questions
const questionsDir = join(root, 'posts/_questions')
const outQuestions = join(root, 'src/content/questions')
for (const file of readdirSync(questionsDir)) {
  if (!file.endsWith('.md')) continue
  const src = join(questionsDir, file)
  const dest = join(outQuestions, file)
  let md = readFileSync(src, 'utf8')
  // Strip Jekyll layout from frontmatter to avoid Astro trying to import an invalid layout module
  if (md.startsWith('---')) {
    const end = md.indexOf('\n---', 3)
    if (end !== -1) {
      const fmRaw = md.slice(3, end).split('\n')
        .filter((line) => !/^\s*layout\s*:/i.test(line))
        .join('\n')
      md = `---${fmRaw}\n---` + md.slice(end + 4)
    }
  }
  writeFileSync(dest, md)
}

// Migrate code
const includesCode = join(root, '_includes/code')
for (const slug of readdirSync(includesCode)) {
  const srcDir = join(includesCode, slug)
  const destDir = join(root, 'src/code', slug)
  ensureDir(destDir)
  // copy solution.* files
  for (const file of readdirSync(srcDir)) {
    if (!file.startsWith('solution.')) continue
    cpSync(join(srcDir, file), join(destDir, file))
  }
}

console.log('Content migrated to Astro structure')


