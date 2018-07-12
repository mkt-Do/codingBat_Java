public boolean gHappy(String str) {
  for (int i = 0; i < str.length(); i++) {
    char[] charArr = str.toCharArray();
    if (charArr[i] == 'g') {
      if (str.length() == 1) {
        return false;
      } else if (i == 0) {
        if (charArr[i + 1] != 'g') {
          return false;
        }
      } else if (i == str.length() - 1) {
        if (charArr[i - 1] != 'g') {
          return false;
        }
      } else if (charArr[i - 1] != 'g' && charArr[i + 1] != 'g') {
        return false;
      }
    }
  }
  return true;
}

