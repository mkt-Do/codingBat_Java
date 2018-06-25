public int maxMod5(int a, int b) {
  return (a % 5 == b % 5)
    ? (a > b) ? b : (a == b) ? 0 : a
    : (a > b) ? a : (a == b) ? 0 : b;
}

