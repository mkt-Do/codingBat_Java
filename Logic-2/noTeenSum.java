public int noTeenSum(int a, int b, int c) {
  int[] ages = new int[3];
  ages[0] = a;
  ages[1] = b;
  ages[2] = c;
  int sum = 0;
  for (int age : ages) {
    sum += fixTeen(age);
  }
  return sum;
}

private int fixTeen(int n) {
  return ((n >= 13 && n < 15) || (n >= 17 && n < 20))
    ? 0 : n;
}

