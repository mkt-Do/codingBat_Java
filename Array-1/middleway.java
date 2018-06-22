public int[] middleWay(int[] a, int[] b) {
  if (a.length % 2 == 0 || b.length % 2 == 0) {
    return new int[] { 0, 0 };
  }
  return new int[] { a[a.length / 2], b[b.length / 2] };
}

