public boolean bobThere(String str) {
  char[] strChar = str.toCharArray();
  for (int i = 0; i < strChar.length - 2; i++) {
    if (strChar[i] == 'b' && strChar[i + 2] == 'b') {
      return true;
    }
  }
  return false;
}

