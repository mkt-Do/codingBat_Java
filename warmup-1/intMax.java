public int intMax(int a, int b, int c) {
  return (a < b)
    ? (b < c) ? c : b
    : (a < c) ? c : a;
}

