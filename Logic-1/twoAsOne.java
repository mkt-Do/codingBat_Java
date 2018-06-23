public boolean twoAsOne(int a, int b, int c) {
  int sum = a + b + c;
  return (sum - a) == a || (sum - b) == b || (sum - c) == c;
}

