function findMedianSortedArrays(nums1: number[], nums2: number[]): number {
    const l1 = nums1.length, l2 = nums2.length;
    if (l1 > l2) {
        return findMedianSortedArrays(nums2, nums1);
    }

    let left = 0, right = l1;
    while (left <= right) {
        const mid1 = Math.floor((left + right) / 2);
        const mid2 = Math.floor((l1 + l2 + 1) / 2) - mid1;

        const x1 = mid1 === 0 ? -Infinity : nums1[mid1 - 1];
        const x2 = mid2 === 0 ? -Infinity : nums2[mid2 - 1];
        const y1 = mid1 === l1 ? Infinity : nums1[mid1];
        const y2 = mid2 === l2 ? Infinity : nums2[mid2];

        if (x1 <= y2 && x2 <= y1) {
            if ((l1 + l2) % 2 === 0) {
                return (Math.max(x1, x2) + Math.min(y1, y2)) / 2.0;
            } else {
                return Math.max(x1, x2);
            }
        }

        if (x1 > y2) {
            right = mid1 - 1;
        } else {
            left = mid1 + 1;
        }
    }

    return -1;
}
