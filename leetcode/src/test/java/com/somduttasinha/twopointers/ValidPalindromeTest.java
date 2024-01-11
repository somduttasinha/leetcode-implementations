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
    void notAPalindrome() {
        String s = "abracadabra";

        assertFalse(validPalindrome.isPalindrome(s));
    }
}
