import { defineConfig } from 'astro/config'
import tailwind from '@astrojs/tailwind'

export default defineConfig({
  integrations: [tailwind({ applyBaseStyles: true })],
  site: 'https://rajat19.github.io/interview-questions',
  vite: {
    server: {
      fs: { allow: ['.'] },
    },
  },
})


