class Solution {
    public List<Integer> countSmaller(int[] nums) {
        int n = nums.length;
        Pair[] pairs = new Pair[n];
        for(int i=0; i<n; i++) {
            pairs[i] = new Pair(nums[i], i);
        }

        int[] count = new int[n];
        mergeSort(count, pairs, 0, n-1);
        List<Integer> result = new ArrayList<>();
        for(int c: count) result.add(c);
        return result;
    }

    private void mergeSort(int[] count, Pair[] pairs, int left, int right) {
        if (left >= right) return;
        int mid = left + (right-left)/2;
        mergeSort(count, pairs, left, mid);
        mergeSort(count, pairs, mid+1, right);
        merge(count, pairs, left, mid, right);
    }

    private void merge(int[] count, Pair[] pairs, int left, int mid, int right) {
        Pair[] temp = new Pair[right-left+1];
        int i=left, j=mid+1, k=0;
        while(i <= mid && j<= right) {
            if (pairs[i].val <= pairs[j].val) {
                temp[k++] = pairs[j++];
            } else {
                count[pairs[i].pos] += right - j + 1;
                temp[k++] = pairs[i++];
            }
        }
        while(i <= mid) {
            temp[k++] = pairs[i++];
        }
        while(j <= right) {
            temp[k++] = pairs[j++];
        }
        for(i=left; i<= right; i++) {
            pairs[i] = temp[i-left];
        }
    }
}

class Pair {
    int val;
    int pos;

    public Pair(int val, int pos) {
        this.val = val;
        this.pos = pos;
    }
}