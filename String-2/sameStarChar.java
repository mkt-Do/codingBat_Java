public boolean sameStarChar(String str) {
  for (int i = 1; i < str.length() - 1; i++) {
    if (str.toCharArray()[i] == '*') {
      String substr = str.substring(i - 1, i + 2);
      if (!substr.equals((new StringBuffer(substr)).reverse().toString())) {
        return false;
      }
    }
  }
  return true;
}

