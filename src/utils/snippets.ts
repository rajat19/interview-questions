import fs from 'fs';
import path from 'path';

/**
 * Reads solution snippets for a given question slug and returns them as an object.
 * @param {string} slug - The slug of the question.
 * @param {string[]} languages - An array of programming languages to read snippets for.
 * @returns {Record<string, string>} An object where keys are language names and values are the code snippets.
 */
export function getSnippetsForQuestion(slug: string, languages: string[]) {
    const snippets: Record<string, string> = {};
    for (const language of languages) {
        try {
            snippets[language] = fs.readFileSync(
                path.join(process.cwd(), 'src', 'solutions', slug, `solution.${language}`),
                'utf-8'
            );
        } catch {
            snippets[language] = '';
            console.log('Error reading file for language:', language, 'in slug:', slug);
        }
    }
    return snippets;
}