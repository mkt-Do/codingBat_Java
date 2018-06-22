public int[] reverse3(int[] nums) {
  int[] revArr = new int[nums.length];
  for (int i = 0; i < nums.length; i++) {
    revArr[nums.length - 1 - i] = nums[i];
  }
  return revArr;
}

