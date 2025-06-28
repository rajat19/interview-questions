class Solution:
    def removeDuplicateLetters(self, s: str) -> str:
        stack, occ, visited = [], {}, {}
        for c in s:
            occ[c] = occ.get(c, 0) + 1
            visited[c] = False
        for c in s:
            occ[c] -= 1
            if visited[c]:
                continue
            while stack and c < stack[-1] and occ[stack[-1]] > 0:
                visited[stack.pop()] = False
            visited[c] = True
            stack.append(c)
        return ''.join(stack)