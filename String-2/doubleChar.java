public String doubleChar(String str) {
  String res = "";
  for (char c : str.toCharArray()) {
    res += String.valueOf(c) + String.valueOf(c);
  }
  return res;
}

