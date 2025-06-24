import os
import yaml

def parse_markdown(filepath):
    """Parse frontmatter and content from markdown."""
    with open(filepath, 'r', encoding='utf-8') as f:
        lines = f.readlines()

    if lines[0].strip() != '---':
        raise ValueError(f"{filepath} does not start with valid frontmatter.")

    # Extract frontmatter
    frontmatter_end = lines[1:].index('---\n') + 1
    frontmatter = ''.join(lines[1:frontmatter_end])
    content = ''.join(lines[frontmatter_end + 1:])

    data = yaml.safe_load(frontmatter)
    return data, content

def serialize_markdown(data, content):
    """Serialize frontmatter with inline lists and no nulls."""
    # Convert lists to inline format
    for key in ['langs', 'topics', 'companies']:
        if key in data and isinstance(data[key], list):
            data[key] = f"[{', '.join(data[key])}]"

    # Replace None with empty string
    for key, value in data.items():
        if value is None:
            data[key] = ""

    # Convert to frontmatter text manually
    frontmatter_lines = ["---"]
    for key, value in data.items():
        if isinstance(value, str) and value.startswith('[') and value.endswith(']'):
            frontmatter_lines.append(f"{key}: {value}")
        else:
            frontmatter_lines.append(f"{key}: {value}")
    frontmatter_lines.append("---")

    return '\n'.join(frontmatter_lines) + '\n' + content

def ensure_keys(data, keys):
    """Ensure given keys are present in the dictionary."""
    for key in keys:
        if key not in data:
            data[key] = ''

def convert_space_to_list(data, key):
    """Convert space-separated string into list for specific key."""
    if key in data and isinstance(data[key], str):
        data[key] = data[key].split()

def process_file(filepath, output_dir):
    data, content = parse_markdown(filepath)

    # Convert to list format
    # convert_space_to_list(data, 'langs')
    # convert_space_to_list(data, 'topics')
    convert_space_to_list(data, 'companies')

    # Ensure required keys
    ensure_keys(data, ['companies', 'gfg', 'hackerrank', 'interviewbit'])

    # Serialize and save to _common
    os.makedirs(output_dir, exist_ok=True)
    filename = os.path.basename(filepath)
    new_path = os.path.join(output_dir, filename)

    with open(new_path, 'w', encoding='utf-8') as f:
        f.write(serialize_markdown(data, content))

def process_all():
    output_dir = 'posts/_questions'
    path = 'posts/_questions'

    for filename in os.listdir(path):
        if filename.endswith('.md'):
            filepath = os.path.join(path, filename)
            try:
                process_file(filepath, output_dir)
                print(f"Processed {filepath}")
            except Exception as e:
                print(f"Error processing {filepath}: {e}")

if __name__ == '__main__':
    process_all()
