package com.somduttasinha.twopointers;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ValidPalindromeTest {

    private ValidPalindrome validPalindrome;

    @BeforeEach
    void init() {
        this.validPalindrome = new ValidPalindrome();
    }

    @Test
    void validPalindromeSimple() {

        String s = "aba";

        assertTrue(validPalindrome.isPalindrome(s));

    }

    @Test
    void checkRegexExpression() {
        String input = "A man, a plan, a canal: Panama";

        String output = input.replaceAll("\\p{Punct}", "").replaceAll("\\s", "");

        System.out.println(output);
    }

    @Test
    void validPalindromeComplicated() {
        String s = "A man, a plan, a canal: Panama";

        assertTrue(validPalindrome.isPalindrome(s));
    }

    @Test
    void notAPalindrome() {
        String s = "abracadabra";

        assertFalse(validPalindrome.isPalindrome(s));
    }
}
