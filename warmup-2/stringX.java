public String stringX(String str) {
  int length = str.length();
  String result = "";
  for (int i = 0; i < length; i++) {
    if (i == 0 || i == length - 1 || str.charAt(i) != 'x') {
      result += str.charAt(i);
    }
  }
  return result;
}

