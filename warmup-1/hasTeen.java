public boolean hasTeen(int a, int b, int c) {
  return checkTeen(a) || checkTeen(b) || checkTeen(c);
}

private boolean checkTeen(int age) {
  return (13 <= age) && (age <= 19);
}

