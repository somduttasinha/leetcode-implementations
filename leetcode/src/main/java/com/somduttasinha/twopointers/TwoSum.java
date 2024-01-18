package com.somduttasinha.twopointers;

public class TwoSum {

  public int[] twoSum(int[] numbers, int target) {

    // put one pointer at the start and one pointer at the end, move each one
    // depending on whether the pointed values sum to target

    int left = 0;
    int right = numbers.length - 1;

    while (left < right) {
      int currentSum = numbers[left] + numbers[right];

      if (currentSum == target) {
        return new int[] {left + 1, right + 1};
      } else if (currentSum < target) {
        left += 1;
      } else {
        right -= 1;
      }
    }

    return null;
  }
}
