public String twoChar(String str, int index) {
  if (str.length() < 2) {
    return str;
  }
  return (str.length() - 1 <= index || index < 0)
    ? str.substring(0, 2)
    : str.substring(index, index + 2);
}

