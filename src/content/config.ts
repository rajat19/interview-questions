import { defineCollection, z } from 'astro:content'

const questions = defineCollection({
  type: 'content',
  schema: z.object({
    title: z.string(),
    topics: z.preprocess((v) => (v === null ? [] : v), z.array(z.string()).default([])),
    langs: z.array(z.string()),
    tc: z.string().optional().nullable(),
    sc: z.string().optional().nullable(),
    leetid: z.number().optional().nullable(),
    companies: z.preprocess((v) => (v === null ? [] : v), z.array(z.string()).default([])),
    difficulty: z.enum(['easy','medium','hard']),
    leetcode: z.string().optional().nullable(),
    gfg: z.string().optional().nullable(),
    hackerrank: z.string().optional().nullable(),
    interviewbit: z.string().optional().nullable(),
  })
})

export const collections = { questions }


