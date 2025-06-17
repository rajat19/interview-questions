// @ts-check
import { defineConfig } from 'astro/config';
import mdx from '@astrojs/mdx';

import tailwindcss from '@tailwindcss/vite';

// https://astro.build/config
export default defineConfig({
  site: 'https://github.com/rajat19/interview-questions',

  integrations: [
    mdx(),
  ],

  markdown: {
    shikiConfig: {
      theme: 'github-dark'
    },
  },

  vite: {
    plugins: [tailwindcss()]
  }
});