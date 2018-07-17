public String sameEnds(String string) {
  String str = "";
  for (int i = 0; i < string.length() / 2 + 1; i++) {
    String substr = string.substring(0, i);
    if (string.endsWith(substr)) {
      str = substr;
    }
  }
  return str;
}

