public boolean makeBricks(int small, int big, int goal) {
  int numOfBig = goal / 5;
  int rem = (numOfBig <= big)
    ? goal - numOfBig * 5
    : goal - big * 5;
  int numOfSmall = rem;
  return numOfSmall <= small;
}

