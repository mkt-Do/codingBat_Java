public int close10(int a, int b) {
  int diffA = (10 - a) > 0
    ? 10 - a
    : a - 10;
  int diffB = (10 - b) > 0
    ? 10 - b
    : b - 10;
  return (diffA - diffB) > 0
    ? b
    : (diffA - diffB) < 0
    ? a
    : 0;
}

