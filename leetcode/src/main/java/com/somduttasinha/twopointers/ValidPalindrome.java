package com.somduttasinha.twopointers;

class ValidPalindrome {

    /**
     * This method checks whether a given string is a palindrome.
     *
     * @param s the string to check
     * @return true if s is a palindrome, false otherwise
     */
    public boolean isPalindrome(String s) {

        if (s == null)
            return false;

        if (s.length() == 1)
            return true; // by default 1-length strings should be palindromes
        // \\p{Punct}
        char[] chars = s.toLowerCase().replaceAll("\\p{Punct}", "").replaceAll("\\s", "").toCharArray();

        int leftPointer = 0;
        int rightPointer = chars.length - 1;

        while (leftPointer < rightPointer) {
            if (chars[leftPointer] != chars[rightPointer])
                return false;
            leftPointer++;
            rightPointer--;
        }

        return true;
    }
}
