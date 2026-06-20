class Solution {
    public int myAtoi(String s) {

        int i = 0;
        int sign = 1;      // Assume positive initially
        int result = 0;    // Stores the number being built

        // Skip leading spaces
        while (i < s.length() && s.charAt(i) == ' ') {
            i++;
        }

        // Check for optional sign
        if (i < s.length() &&
            (s.charAt(i) == '+' || s.charAt(i) == '-')) {

            if (s.charAt(i) == '-') {
                sign = -1;
            }

            i++;
        }

        // Process digits one by one
        while (i < s.length() && Character.isDigit(s.charAt(i))) {

            // Convert character digit to integer digit
            // Example: '7' -> 7
            int digit = s.charAt(i) - '0';

            /*
             * Overflow check BEFORE:
             * result = result * 10 + digit
             *
             * Integer.MAX_VALUE = 2147483647
             * Integer.MAX_VALUE / 10 = 214748364
             *
             * Case 1:
             * result > 214748364
             * Then multiplying by 10 will definitely overflow.
             *
             * Case 2:
             * result == 214748364
             * Then only digits 0..7 are safe.
             * Digit 8 or 9 causes overflow.
             */
            if (result > Integer.MAX_VALUE / 10 ||
                (result == Integer.MAX_VALUE / 10 &&
                 digit > 7)) {

                // Positive overflow
                if (sign == 1) {
                    return Integer.MAX_VALUE;
                }

                // Negative overflow
                return Integer.MIN_VALUE;
            }

            // Safely build the number
            result = result * 10 + digit;

            i++;
        }

        // Apply sign and return final answer
        return result * sign;
    }
}
