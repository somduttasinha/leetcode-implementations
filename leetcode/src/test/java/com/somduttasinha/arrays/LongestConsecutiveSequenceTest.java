package com.somduttasinha.arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LongestConsecutiveSequenceTest {

    private LongestConsecutiveSequence solution;

    @BeforeEach
    void init() {
        solution = new LongestConsecutiveSequence();
    }

    @Test
    void fourConsecutiveNumbers() {
        int[] nums = new int[] { 100, 4, 200, 1, 3, 2 };

        assertEquals(4, solution.longestConsecutive(nums));

    }

    @Test
    void consecutiveNumbersWithZeroInBetween() {

        int[] nums = new int[] { 100, 2, 200, -1, 1, 0 };


        assertEquals(solution.longestConsecutive(nums), 4);
    }
}
