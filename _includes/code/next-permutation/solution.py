from typing import List


class Solution:
    def nextPermutation(self, arr: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        n = len(arr)
        i, j = n - 2, 0
        while i >= 0 and arr[i] >= arr[i + 1]:
            i -= 1
        j = i + 1
        if i >= 0:
            j = n - 1
            while j >= 0 and arr[j] <= arr[i]:
                j -= 1
            arr[i], arr[j] = arr[j], arr[i]
        start, end = i + 1, n - 1
        while start < end:
            arr[start], arr[end] = arr[end], arr[start]
            start += 1
            end -= 1
