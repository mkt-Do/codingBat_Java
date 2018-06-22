public int[] makeLast(int[] nums) {
  if (nums.length == 0) {
    return new int[] { 0 };
  }
  int[] res = new int[nums.length * 2];
  res[res.length - 1] = nums[nums.length - 1];
  return res;
}

