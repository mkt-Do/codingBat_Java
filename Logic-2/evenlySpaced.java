public boolean evenlySpaced(int a, int b, int c) {
  int[] nums = { a, b, c };
  int[] sorted = Arrays.stream(nums)
    .sorted().toArray();
  return (sorted[1] - sorted[0]) == (sorted[2] - sorted[1]);
}

