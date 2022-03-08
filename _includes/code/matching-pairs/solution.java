class Solution {
    public int matchingPairs(String s, String t) {
        // Write your code here
        int match = 0;
        Set<String> unmatched = new HashSet<>();
        Set<Character> matched = new HashSet<>();
        boolean hasDup = false;
        int n = s.length();
        for(int i=0; i<n; i++) {
            if (s.charAt(i) == t.charAt(i)) {
                match++;
                if (matched.contains(s.charAt(i))) hasDup = true;
                matched.add(s.charAt(i));
            } else {
                unmatched.add(s.charAt(i)+""+t.charAt(i));
            }
        }
        if (match == n) return hasDup ? n : n-2;
        if (match == n-1) {
            String onlyUnmatched = (String)unmatched.toArray()[0];
            if (hasDup || matched.contains(onlyUnmatched.charAt(0)) || matched.contains(onlyUnmatched.charAt(1))) {
                return match;
            }
            return match - 1;
        }

        for(String um: unmatched) {
            if (unmatched.contains(um.charAt(1)+""+um.charAt(0))) {
                return match+2;
            }
        }

        Set<Character> unmatchedS = new HashSet<>();
        Set<Character> unmatchedT = new HashSet<>();

        for(String um : unmatched) {
            if(unmatchedS.contains(um.charAt(1)) || unmatchedT.contains(um.charAt(0))) {
                return match + 1;
            }
            unmatchedS.add(um.charAt(0));
            unmatchedT.add(um.charAt(1));
        }
        return match;
    }
}