public String without2(String str) {
  if (str.length() == 2) {
    return "";
  }
  if (str.length() < 2) {
    return str;
  }
  String tail = str.substring(str.length() - 2);
  return str.startsWith(tail)
    ? str.substring(2)
    : str;
}

