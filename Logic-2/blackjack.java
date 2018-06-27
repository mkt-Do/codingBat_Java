public int blackjack(int a, int b) {
  if (a > 21 && b <= 21) {
    return b;
  } else if (a <= 21 && b > 21) {
    return a;
  } else if (a > 21 && b > 21) {
    return 0;
  } else {
    return (a > b) ? a : b;
  }
}

