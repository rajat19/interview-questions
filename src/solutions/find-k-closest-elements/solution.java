class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int l = 0, r = arr.length - 1;
        while(r - l >= k) {
            if (Math.abs(arr[l] - x) > Math.abs(arr[r] - x)) {
                l++;
            } else {
                r--;
            }
        }
        List<Integer> result = new ArrayList<>();
        for(int i=l; i<=r; i++) {
            result.add(arr[i]);
        }
        return result;
    }
}