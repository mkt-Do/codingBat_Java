public boolean in1020(int a, int b) {
  return inclusive1020(a) || inclusive1020(b);
}

private boolean inclusive1020(int n) {
  return (10 <= n) && (n <= 20);
}

