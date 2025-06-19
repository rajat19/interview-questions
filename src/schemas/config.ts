import { defineCollection, z } from 'astro:content';

const questionSchema = z.object({
  title: z.string(),
  description: z.string().optional(),
  difficulty: z.enum(['hard', 'medium']),
  leetid: z.number().optional(),
  topics: z.array(z.string()).optional(),
  companies: z.array(z.string()).optional(),
  tc: z.string().optional(),
  sc: z.string().optional(),
  date: z.string(),
  langs: z.string() // Languages available for this problem
});

const questionsCollection = defineCollection({
  type: 'content',
  schema: questionSchema
});

export const collections = {
  'questions': questionsCollection
}; 