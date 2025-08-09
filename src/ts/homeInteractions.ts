const clearPostData = () => {
  const mobileDiv = document.querySelector('.post-data-only-mobile') as HTMLElement | null
  const postData = document.getElementById('post-data') as HTMLElement | null
  if (postData) postData.innerHTML = ''
  if (mobileDiv) {
    mobileDiv.classList.remove('active')
    mobileDiv.innerHTML = ''
  }
}

const showFilter = (filterType: string, filterValue: string) => {
  clearPostData()
  document.querySelectorAll('.post-link').forEach((postLink) => postLink.classList.remove('active'))
  document.querySelectorAll('.home-box li').forEach((li) => {
    const el = li as HTMLElement
    el.style.display = 'block'
    if (!el.classList.contains(`${filterType}-${filterValue}`)) el.style.display = 'none'
  })
  const dropdown = document.getElementById(`${filterType}-dropdown`) as HTMLSelectElement | null
  if (dropdown) dropdown.value = `${filterType}-${filterValue}`
  document.querySelector('.home-post-list')?.scrollTop
}

const showTopic = (topicValue: string) => showFilter('topic', topicValue)
const showCompany = (companyValue: string) => showFilter('company', companyValue)
const showDifficulty = (difficultyValue: string) => showFilter('difficulty', difficultyValue)

document.addEventListener('DOMContentLoaded', () => {
  document.querySelectorAll('.post-link').forEach((postLink) => {
    postLink.addEventListener('click', async (e) => {
      e.preventDefault()
      document.querySelectorAll('.post-link').forEach((link) => link.classList.remove('active'))

      const width = window.innerWidth
      const postData = document.getElementById('post-data') as HTMLElement | null
      const href = (postLink as HTMLAnchorElement).href

      if (width >= 800) {
        clearPostData()
        if (!postData) return
        postData.innerHTML = ''
        try {
          const res = await fetch(href)
          const html = await res.text()
          postData.innerHTML = html
          postData.scrollTop
        } catch (e) { console.error(e) }
      } else {
        const sibling = (postLink as HTMLElement).nextElementSibling as HTMLElement | null
        if (!sibling) return
        if (sibling.classList.contains('active')) {
          sibling.innerHTML = ''
          sibling.classList.remove('active')
          return
        }
        clearPostData()
        sibling.innerHTML = ''
        try {
          const res = await fetch(href)
          const html = await res.text()
          sibling.innerHTML = html
          sibling.classList.add('active')
          sibling.scrollTop
        } catch (e) { console.error(e) }
      }
      postLink.classList.add('active')
    })
  })

  ;(document.getElementById('topic-dropdown') as HTMLSelectElement | null)?.addEventListener('change', (event) => {
    const selected = (event.target as HTMLSelectElement).value.replace('topic-','')
    showTopic(selected)
  })
  ;(document.getElementById('company-dropdown') as HTMLSelectElement | null)?.addEventListener('change', (event) => {
    const selected = (event.target as HTMLSelectElement).value.replace('company-','')
    showCompany(selected)
  })
  ;(document.getElementById('difficulty-dropdown') as HTMLSelectElement | null)?.addEventListener('change', (event) => {
    const selected = (event.target as HTMLSelectElement).value.replace('difficulty-','')
    showDifficulty(selected)
  })

  ;(document.getElementById('search-box') as HTMLInputElement | null)?.addEventListener('keyup', (event) => {
    clearPostData()
    document.querySelectorAll('.post-link').forEach((link) => link.classList.remove('active'))
    const value = (event.target as HTMLInputElement).value.toLowerCase()
    document.querySelectorAll('.home-box li').forEach((li) => {
      const el = li as HTMLElement
      el.style.display = el.textContent?.toLowerCase().includes(value) ? 'block' : 'none'
    })
    document.querySelector('.home-post-list')?.scrollTop
  })
})

// expose for post header pills
;(window as any).showTopic = showTopic
;(window as any).showCompany = showCompany
;(window as any).showDifficulty = showDifficulty


