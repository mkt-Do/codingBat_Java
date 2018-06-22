public int[] fix23(int[] nums) {
  int[] res = new int[nums.length];
  res[0] = nums[0];
  for (int i = 1; i < nums.length; i++) {
    if (nums[i-1] == 2 && nums[i] == 3) {
      res[i] = 0;
    } else {
      res[i] = nums[i];
    }
  }
  return res;
}

