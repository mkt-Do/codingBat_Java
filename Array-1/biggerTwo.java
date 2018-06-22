public int[] biggerTwo(int[] a, int[] b) {
  int asum = Arrays.stream(a).sum();
  int bsum = Arrays.stream(b).sum();
  return (asum < bsum) ? b : a;
}

