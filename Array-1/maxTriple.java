public int maxTriple(int[] nums) {
  if (nums.length < 1 || nums.length % 2 == 0) {
    return 0;
  }
  int mid = nums.length / 2;
  int[] firstMidLast = new int[] { nums[0], nums[mid], nums[nums.length - 1] };
  return Arrays.stream(firstMidLast).max().orElse(0);
}

