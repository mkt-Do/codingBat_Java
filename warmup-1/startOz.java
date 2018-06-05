public String startOz(String str) {
  String result = "";
  int length = str.length();
  if (length >= 1 && str.charAt(0) == 'o') {
    result += str.charAt(0);
  }
  if (length >= 2 && str.charAt(1) == 'z') {
    result += str.charAt(1);
  }
  return result;
}

