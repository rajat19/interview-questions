import java.lang.*;

class Solution {
    private static double findMedian(int[] arr1, int[] arr2) {
        int n1 = arr1.length, n2 = arr2.length;
        if (n1 > n2) return findMedian(arr2, arr1);
        int start = 0, end = n1;
        while(start <= end) {
            int mid1 = start + (end - start)/2;
            int mid2 = (n1+n2+1)/2 - mid1;
            int x1 = mid1 == 0 ? Integer.MIN_VALUE : arr1[mid1 - 1];
            int x2 = mid2 == 0 ? Integer.MIN_VALUE : arr2[mid2 - 1];
            int y1 = mid1 == n1 ? Integer.MAX_VALUE : arr1[mid1];
            int y2 = mid2 == n2 ? Integer.MAX_VALUE : arr2[mid2];
            if (x1 <= y2 && x2 <= y1) {
                if ((n1+n2)%2 == 0) {
                    return (Math.max(x1, x2) + Math.min(y1, y2)) / 2.0;
                }
                return Math.max(x1, x2);
            }
            if (x1 > y2) {
                end = mid1 - 1;
            } else {
                start = mid1 + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr1 = { -5, 3, 6, 12, 15 };
        int[] arr2 = { -12, -10, -6, -3, 4, 10 };
        System.out.println(findMedian(arr1, arr2));
    }
}