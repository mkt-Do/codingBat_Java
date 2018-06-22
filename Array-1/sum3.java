public int sum3(int[] nums) {
  int length = nums.length;
  if (length != 3) {
    return 0;
  }
  return Arrays.stream(nums).reduce(0, (acc, v) -> acc + v);
}

