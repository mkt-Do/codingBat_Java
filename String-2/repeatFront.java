public String repeatFront(String str, int n) {
  int length = str.length() < n ? str.length() : n;
  String result = "";
  for (int i = 0; i< length; i++) {
    String substr = str.substring(0, (length - i));
    result += substr;
  }
  return result;
}

