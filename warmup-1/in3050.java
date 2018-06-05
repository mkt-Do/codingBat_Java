public boolean in3050(int a, int b) {
  return (rangeFrom30To40(a) && rangeFrom30To40(b))
    || (rangeFrom40To50(a) && (rangeFrom40To50(b)));
}

private boolean rangeFrom30To40(int n) {
  return (30 <= n) && (n <= 40);
}

private boolean rangeFrom40To50(int n) {
  return (40 <= n) && (n <= 50);
}

