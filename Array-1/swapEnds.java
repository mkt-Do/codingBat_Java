public int[] swapEnds(int[] nums) {
  if (nums.length < 2) {
    return nums;
  }
  int[] res = new int[nums.length];
  for (int i = 1; i < nums.length - 1; i++) {
    res[i] = nums[i];
  }
  res[0] = nums[nums.length - 1];
  res[nums.length - 1] = nums[0];
  return res;
}

