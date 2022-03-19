class Solution {
    public String getPermutation(int n, int k) {
        List<Integer> num = new LinkedList<Integer>();
        int[] fact = new int[n];
        k--;
        for(int i=0; i<n; i++) {
            num.add(i+1);
            if (i==0) {
                fact[i] = 1;
            } else {
                fact[i] = i*fact[i-1];
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = n; i > 0; i--){
            int ind = k/fact[i-1];
            k = k%fact[i-1];
            sb.append(num.get(ind));
            num.remove(ind);
        }
        return sb.toString();
    }
}