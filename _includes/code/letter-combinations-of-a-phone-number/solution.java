class Solution {
    public List<String> letterCombinations(String digits) {
        Map<Integer, List<Character>> phone = new HashMap<>();
        phone.put(2, Arrays.asList('a', 'b', 'c'));
        phone.put(3, Arrays.asList('d', 'e', 'f'));
        phone.put(4, Arrays.asList('g', 'h', 'i'));
        phone.put(5, Arrays.asList('j', 'k', 'l'));
        phone.put(6, Arrays.asList('m', 'n', 'o'));
        phone.put(7, Arrays.asList('p', 'q', 'r', 's'));
        phone.put(8, Arrays.asList('t', 'u', 'v'));
        phone.put(9, Arrays.asList('w', 'x', 'y', 'z'));
        List<String> result = new ArrayList<>();
        if (digits.length() == 0) return result;
        generate(digits, 0, phone, result, new StringBuilder());
        return result;
    }

    private void generate(String digits, int pos, Map<Integer, List<Character>> phone, List<String> result, StringBuilder sb) {
        if (sb.length() == digits.length()) {
            result.add(sb.toString());
            return;
        }
        int digit = digits.charAt(pos) - '0';
        for(Character c: phone.get(digit)) {
            sb.append(c);
            generate(digits, pos+1, phone, result, sb);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}