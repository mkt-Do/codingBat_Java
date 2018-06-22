public boolean firstLast6(int[] nums) {
  int length = nums.length;
  if (length == 0) {
    return false;
  }
  return (nums[0] == 6) || (nums[length-1] == 6);
}

