public int[] maxEnd3(int[] nums) {
  int max = (nums[0] < nums[nums.length-1]) ? nums[nums.length-1] : nums[0];
  int[] maxArr = new int[nums.length];
  for (int i = 0; i < nums.length; i++) {
    maxArr[i] = max;
  }
  return maxArr;
}

