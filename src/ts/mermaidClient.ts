import mermaid from 'mermaid'

const mermaidConfig = {
  startOnLoad: true,
  theme: 'dark',
  flowchart: { useMaxWidth: false, htmlLabels: true },
} as const

function initIn(container: HTMLElement | Document = document) {
  mermaid.initialize(mermaidConfig as any)
  const els = container.querySelectorAll('.language-mermaid')
  els.forEach((el) => mermaid.init(undefined as any, el as any))
}

document.addEventListener('DOMContentLoaded', () => {
  initIn(document)
  const postData = document.getElementById('post-data')
  if (!postData) return
  const observer = new MutationObserver(() => initIn(postData))
  observer.observe(postData, { childList: true, subtree: true })
})



