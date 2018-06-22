public int[] makeEnds(int[] nums) {
  if (nums.length == 0) {
    return new int[] { 0, 0 };
  }
  return new int[] { nums[0], nums[nums.length - 1] };
}

