public boolean nearHundred(int n) {
  return (abs(100 - n) <= 10) || (abs(200 - n) <= 10);
}

private int abs(int n) {
  return n > 0 ? n : n * (-1);
}

