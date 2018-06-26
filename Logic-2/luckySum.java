public int luckySum(int a, int b, int c) {
  int[] nums = new int[3];
  nums[0] = a;
  nums[1] = b;
  nums[2] = c;
  int sum = 0;
  for (int n : nums) {
    if (n == 13) {
      break;
    }
    sum += n;
  }
  return sum;
}

