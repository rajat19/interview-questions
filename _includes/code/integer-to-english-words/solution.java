class Solution {
    private static final String[] LESS_THAN_20 = {
            "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine",
            "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen",
            "Sixteen", "Seventeen", "Eighteen", "Nineteen"
    };

    private static final String[] TENS = {
            "", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"
    };

    private static final String[] THOUSANDS = {
            "", "Thousand", "Million", "Billion"
    };

    public String numberToWords(int num) {
        if (num == 0) return "Zero";

        StringBuilder sb = new StringBuilder();
        int i = 0;

        while (num > 0) {
            int chunk = num % 1000;
            if (chunk != 0) {
                StringBuilder part = new StringBuilder();
                helper(chunk, part);
                if (!THOUSANDS[i].isEmpty()) part.append(THOUSANDS[i]).append(" ");
                sb.insert(0, part);
            }
            num /= 1000;
            i++;
        }

        return sb.toString().trim();
    }

    private void helper(int num, StringBuilder sb) {
        if (num == 0) return;

        if (num < 20) {
            sb.append(LESS_THAN_20[num]).append(" ");
        } else if (num < 100) {
            sb.append(TENS[num / 10]).append(" ");
            helper(num % 10, sb);
        } else {
            sb.append(LESS_THAN_20[num / 100]).append(" Hundred ");
            helper(num % 100, sb);
        }
    }
}
