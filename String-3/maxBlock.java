public int maxBlock(String str) {
  int max = 0;
  int count = 0;
  for (int i = 0; i < str.length(); i++) {
    count++;
    if (max < count) {
      max = count;
    }
    if (i == str.length() - 1) {
      break;
    }
    char thisChar = str.toCharArray()[i];
    char nextChar = str.toCharArray()[i + 1];
    if (thisChar != nextChar) {
      count = 0;
    }
  }
  return max;
}

