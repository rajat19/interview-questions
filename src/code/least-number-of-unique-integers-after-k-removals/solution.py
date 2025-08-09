class Solution:
    def findLeastNumOfUniqueInts(self, arr: List[int], k: int) -> int:
        count_map = {}
        for el in arr:
            count_map[el] = (count_map[el] if el in count_map else 0) + 1
        freq = [0] * 100000
        unique = len(count_map)
        for v in count_map.values():
            freq[v] += 1
        for i in range(1, 100000):
            if freq[i] != 0:
                remove = k // i
                if remove == 0:
                    break
                else:
                    remove = min(remove, freq[i])
                    unique -= remove
                    k -= remove * i
        return unique