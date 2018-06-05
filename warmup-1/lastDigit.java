public boolean lastDigit(int a, int b) {
  if ((a < 0) || (b < 0)) {
    return false;
  }
  return (a % 10) == (b % 10);
}

