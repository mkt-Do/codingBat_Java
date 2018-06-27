public int roundSum(int a, int b, int c) {
  return round10(a) + round10(b) + round10(c); 
}

private int round10(int n) {
  return (n % 10 < 5) ? (n / 10) * 10 : (n / 10 + 1) * 10;
}

