class Solution {
public:
    double findMedianSortedArrays(vector<int>& nums1, vector<int>& nums2) {
        int n1 = nums1.size(), n2 = nums2.size();
        if (n1 > n2) return findMedianSortedArrays(nums2, nums1);
        int start = 0, end = n1;
        while(start <= end) {
            int mid1 = start + (end-start)/2;
            int mid2 = (n1+n2+1)/2 - mid1;
            int x1 = mid1 == 0 ? INT_MIN : nums1[mid1-1];
            int x2 = mid2 == 0 ? INT_MIN : nums2[mid2-1];
            int y1 = mid1 == n1 ? INT_MAX : nums1[mid1];
            int y2 = mid2 == n2 ? INT_MAX : nums2[mid2];
            if (x1 <= y2 && x2 <= y1) {
                if ((n1+n2)%2 == 0) {
                    return (max(x1, x2) + min(y1, y2)) /2.0;
                } else {
                    return max(x1, x2);
                }
            }
            if (x1 > y2) {
                end = mid1 - 1;
            } else {
                start = mid1 + 1;
            }
        }
        return -1;
    }
};