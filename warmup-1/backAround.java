public String backAround(String str) {
  int length = str.length();
  String lastChar = str.substring(length - 1);
  return lastChar + str + lastChar;
}

