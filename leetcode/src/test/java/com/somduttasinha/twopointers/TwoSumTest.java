package com.somduttasinha.twopointers;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TwoSumTest {

  TwoSum twoSum;

  @BeforeEach
  void init() {
    twoSum = new TwoSum();
  }

  @Test
  void example1() {
    int[] numbers = {2, 7, 11, 15};
    int target = 9;
    int[] answer = twoSum.twoSum(numbers, target);

    assertEquals(1, answer[0]);
    assertEquals(2, answer[1]);
  }

  @Test
  void example2() {
    int[] numbers = {2, 3, 4};
    int target = 6;
    int[] answer = twoSum.twoSum(numbers, target);

    assertEquals(1, answer[0]);
    assertEquals(3, answer[1]);
  }
}
