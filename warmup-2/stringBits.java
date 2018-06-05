public String stringBits(String str) {
  String result = "";
  int length = str.length();
  for (int i = 0; i < length; i += 2) {
    result += str.substring(i, i + 1);
  }
  return result;
}

