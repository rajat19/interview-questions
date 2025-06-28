class Solution:

    def __init__(self, w: List[int]):
        self.prefix = [0] * len(w)
        self.prefix[0] = w[0]
        for i in range(1, len(w)):
            self.prefix[i] = self.prefix[i - 1] + w[i]
        self.total = self.prefix[-1]

    def pickIndex(self) -> int:
        pick = random.randint(1, self.total)
        left, right = 0, len(self.prefix) - 1
        while left < right:
            mid = (left + right) // 2
            if self.prefix[mid] < pick:
                left = mid + 1
            else:
                right = mid
        return left