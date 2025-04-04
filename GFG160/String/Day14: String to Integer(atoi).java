class Solution {
    public int myAtoi(String s) {
        // Step 1: Trim leading whitespaces
        s = s.trim();
        if (s.length() == 0) return 0;

        int sign = 1, i = 0;
        long res = 0;

        // Step 2: Check for sign
        if (s.charAt(i) == '-') {
            sign = -1;
            i++;
        } else if (s.charAt(i) == '+') {
            i++;
        }

        // Step 3: Convert digits to integer
        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            res = res * 10 + (s.charAt(i) - '0');

            // Step 4: Handle overflow cases
            if (sign * res > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if (sign * res < Integer.MIN_VALUE) return Integer.MIN_VALUE;

            i++;
        }

        return (int) (sign * res);
    }
}
