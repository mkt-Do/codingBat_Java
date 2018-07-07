public boolean prefixAgain(String str, int n) {
  if (n < 1 || str.length() < n) {
    return false;
  }
  String prefix = str.substring(0, n);
  String substr = str.substring(n);
  return substr.contains(prefix);
}

