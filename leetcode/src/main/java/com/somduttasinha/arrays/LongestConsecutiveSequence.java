package com.somduttasinha.arrays;

import java.util.HashSet;
import java.util.Set;

class LongestConsecutiveSequence {

    public int longestConsecutive(int[] nums) {
        int longestSequenceLength = 0;
        if (nums.length < 1)
            return longestSequenceLength;

        Set<Integer> elems = new HashSet<>();
        
        for (int num : nums) {
            elems.add(num);
        }

        for (int i : nums) {
            if (!elems.contains(i - 1)) {
                int x = i;
                int currentSequence = 1;
                while (elems.contains(x + 1)) {
                    x++;
                    currentSequence++;
                }
                if (currentSequence > longestSequenceLength) {
                    longestSequenceLength = currentSequence;
                }
            }
        }

        return longestSequenceLength;

    }

}
