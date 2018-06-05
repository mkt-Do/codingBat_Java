public boolean loneTeen(int a, int b) {
  return (isTeen(a) && !isTeen(b)) || (!isTeen(a) && isTeen(b));
}

private boolean isTeen(int age) {
  return (13 <= age) && (age <= 19);
}

