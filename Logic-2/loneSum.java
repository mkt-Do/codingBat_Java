public int loneSum(int a, int b, int c) {
  if (a == b && b == c && c == a) {
    return 0;
  } else if (a == b) {
    return c;
  } else if (b == c) {
    return a;
  } else if (c == a) {
    return b;
  } else {
    return a + b + c;
  }
}

