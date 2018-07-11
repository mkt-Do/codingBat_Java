public boolean equalIsNot(String str) {
  int isCount = countKeywordInString(str, "is");
  int notCount = countKeywordInString(str, "not");
  
  return isCount == notCount;
}

private int countKeywordInString(String str, String keyword) {
  int count = 0;
  for (int i = 0; i < str.length() - (keyword.length() - 1); i++) {
    String substr = str.substring(i, i + keyword.length());
    if (substr.equals(keyword)) {
      count++;
    }
  }
  return count;
}

