public boolean parrotTrouble(boolean talking, int hour) {
  if (hour < 0 || hour > 23) {
    return false;
  }
  return talking && (hour < 7 || hour > 20);
}

