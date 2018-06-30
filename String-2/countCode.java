public int countCode(String str) {
  int count = 0;
  for (int i = 0; i< str.length() - 3; i++) {
    String substr = str.substring(i, i+4);
    if (substr.startsWith("co") && substr.endsWith("e")) {
      count++;
    }
  }
  return count;
}

