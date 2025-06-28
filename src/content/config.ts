import { defineCollection, z } from 'astro:content';

const questionSchema = z.object({
  title: z.string(),
  topics: z.array(z.string()),
  langs: z.array(z.string()),
  difficulty: z.enum(['hard', 'medium']),
  companies: z.array(z.string()).optional().nullable(),
  tc: z.string().optional(),
  sc: z.string().optional(),
  leetid: z.number().optional().nullable(),
  interviewbit: z.string().optional().nullable(),
  hackerrank: z.string().optional().nullable(),
  gfg: z.string().optional().nullable(),
  leetcode: z.string().optional().nullable(),
});

const questionsCollection = defineCollection({
  type: 'content',
  schema: questionSchema
});

export const collections = {
  'questions': questionsCollection
}; 