import { defineCollection, z } from 'astro:content';

const questionSchema = z.object({
  title: z.string(),
  author: z.string().optional(),
  description: z.string().optional(),
  difficulty: z.enum(['hard', 'medium']),
  leetid: z.number().optional(),
  // TODO: move to array of strings
  topics: z.string(),
  // TODO: move to array of strings
  companies: z.string().optional(),
  tc: z.string().optional(),
  sc: z.string().optional(),
  date: z.date(),
  // TODO: move to array of strings
  langs: z.string()
});

const questionsCollection = defineCollection({
  type: 'content',
  schema: questionSchema
});

export const collections = {
  'questions': questionsCollection
}; 