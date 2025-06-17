import os
import shutil
import re
from pathlib import Path

def extract_code_blocks(content):
    """Extract code blocks from markdown content."""
    code_blocks = {}
    pattern = r'```(\w+)\n([\s\S]*?)```'
    matches = re.finditer(pattern, content)
    
    for match in matches:
        lang = match.group(1)
        code = match.group(2).strip()
        if lang not in code_blocks:
            code_blocks[lang] = []
        code_blocks[lang].append(code)
    
    return code_blocks

def convert_front_matter(content, difficulty):
    """Convert Jekyll front matter to Astro front matter."""
    # Extract existing front matter
    front_matter_match = re.match(r'^---\n([\s\S]*?)\n---', content)
    if not front_matter_match:
        return content
    
    front_matter = front_matter_match.group(1)
    
    # Extract code blocks
    code_blocks = extract_code_blocks(content)
    
    # Build new front matter
    new_front_matter = f"""---
title: {re.search(r'title: (.*)', front_matter).group(1)}
author: {re.search(r'author: (.*)', front_matter).group(1)}
difficulty: {difficulty}
topics: {re.search(r'topics: (.*)', front_matter).group(1)}
langs: {re.search(r'langs: (.*)', front_matter).group(1)}
tc: {re.search(r'tc: (.*)', front_matter).group(1)}
sc: {re.search(r'sc: (.*)', front_matter).group(1)}
leetid: {re.search(r'leetid: (.*)', front_matter).group(1)}
code: {code_blocks}
---"""
    
    # Remove code blocks from content
    content_without_code = re.sub(pattern, '', content)
    
    # Replace front matter
    return re.sub(r'^---\n[\s\S]*?\n---', new_front_matter, content_without_code)

def migrate_content():
    # Create necessary directories
    os.makedirs('shinkansen/src/content/problems', exist_ok=True)
    os.makedirs('shinkansen/public/assets', exist_ok=True)
    
    # Migrate hard problems
    hard_dir = 'posts/_hard'
    for file in os.listdir(hard_dir):
        if file.endswith('.md'):
            with open(os.path.join(hard_dir, file), 'r') as f:
                content = f.read()
            
            # Convert front matter and extract code blocks
            new_content = convert_front_matter(content, 'hard')
            
            # Write to new location
            with open(f'shinkansen/src/content/problems/{file}', 'w') as f:
                f.write(new_content)
    
    # Migrate medium problems
    medium_dir = 'posts/_medium'
    for file in os.listdir(medium_dir):
        if file.endswith('.md'):
            with open(os.path.join(medium_dir, file), 'r') as f:
                content = f.read()
            
            # Convert front matter and extract code blocks
            new_content = convert_front_matter(content, 'medium')
            
            # Write to new location
            with open(f'shinkansen/src/content/problems/{file}', 'w') as f:
                f.write(new_content)
    
    # Copy assets
    if os.path.exists('assets'):
        shutil.copytree('assets', 'shinkansen/public/assets', dirs_exist_ok=True)

if __name__ == '__main__':
    migrate_content() 