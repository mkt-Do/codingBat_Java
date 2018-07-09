public int countYZ(String str) {
  int count = 0;
  for (int i = 0; i < str.length(); i++) {
    if (str.length() == i + 1) {
      if (checkYZ(str.toCharArray()[i])) {
        count++;
      }
    } else if (!Character.isLetter(str.toCharArray()[i + 1])) {
      if (checkYZ(str.toCharArray()[i])) {
        count++;
      }
    }
  }
  return count;
}

private boolean checkYZ(char c) {
  return c == 'Y' || c == 'Z' || c == 'y' || c == 'z';
}

