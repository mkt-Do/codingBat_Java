public int teaParty(int tea, int candy) {
  if (tea <5 || candy < 5) {
    return 0;
  } else if (Math.min(tea, candy) * 2 <= Math.max(tea, candy)) {
    return 2;
  } else {
    return 1;
  }
}

