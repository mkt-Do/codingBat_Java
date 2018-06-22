public boolean sameFirstLast(int[] nums) {
  int length = nums.length;
  if (length == 0) {
    return false;
  }
  return nums[0] == nums[length-1];
}

