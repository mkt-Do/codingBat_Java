public boolean commonEnd(int[] a, int[] b) {
  int alen = a.length;
  int blen = b.length;
  if (alen == 0 || blen == 0) {
    return false;
  }
  return (a[0] == b[0]) || (a[alen-1] == b[blen-1]);
}

