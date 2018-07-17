public String mirrorEnds(String string) {
  String str = "";
  for (int i = 0; i <= string.length(); i++) {
    String substr = string.substring(0, i);
    String reverseStr = (new StringBuilder(substr)).reverse().toString();
    if (string.endsWith(reverseStr)) {
      str = substr;
    }
  }
  return str;
}

