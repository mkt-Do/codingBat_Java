public int max1020(int a, int b) {
  return (inclusive1020(a) && inclusive1020(b))
    ? (a > b) ? a : b
    : (inclusive1020(a) && !inclusive1020(b))
    ? a
    : (!inclusive1020(a) && inclusive1020(b))
    ? b
    : 0;
}

private boolean inclusive1020(int n) {
  return (10 <= n) && (n <= 20);
}

