class Solution:
    def simplifyPath(self, path: str) -> str:
        stack = []
        split = path.split("/")
        for dr in split:
            if dr == '.':
                # do nothing
                pass
            elif dr == '..':
                if len(stack) > 0:
                    stack.pop()
            elif dr == '':
                # do nothing
                pass
            else:
                stack.append(dr)
        return f"/{'/'.join(stack)}"