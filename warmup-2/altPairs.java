public String altPairs(String str) {
  String result = "";
  int length = str.length();
  for (int i = 0; i < length; i += 4) {
    int tail = i + 2;
    if (tail > length) {
      tail = length;
    }
    result += str.substring(i, tail);
  }
  return result;
}

