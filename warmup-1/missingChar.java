public String missingChar(String str, int n) {
  return (str.length() - 1 < n)
    ? str
    : str.substring(0, n) + str.substring(n + 1);
}

