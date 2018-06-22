public int[] plusTwo(int[] a, int[] b) {
  int[] res = new int[a.length + b.length];
  for (int i = 0; i < a.length; i++) {
    res[i] = a[i];
  }
  for (int i = 0; i < b.length; i++) {
    res[i + a.length] = b[i];
  }
  return res;
}

