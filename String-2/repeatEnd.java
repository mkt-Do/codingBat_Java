public String repeatEnd(String str, int n) {
  String substr = str.substring(str.length() - n);
  String repeat = "";
  for (int i = 0; i < n; i++) {
    repeat += substr;
  }
  return repeat;
}

