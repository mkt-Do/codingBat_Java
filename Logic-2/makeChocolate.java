public int makeChocolate(int small, int big, int goal) {
  int numOfBig = (goal / 5 <= big) ? goal / 5 : big;
  int rem = goal - (numOfBig * 5);
  int numOfSmall = (rem <= small) ? rem : -1;
  return numOfSmall;
}

