public int arrayCount9(int[] nums) {
  return (int) Arrays.stream(nums).filter(n -> n == 9).count();
}

