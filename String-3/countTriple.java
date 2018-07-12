public int countTriple(String str) {
  int count = 0;
  char[] charArr = str.toCharArray();
  for (int i = 0; i< str.length() - 2; i++) {
    if (charArr[i] == charArr[i + 1] && charArr[i] == charArr[i + 2]) {
      count++;
    }
  }
  return count;
}

