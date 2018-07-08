public String wordEnds(String str, String word) {
  String result = "";
  if (str.length() <= word.length()) {
    return result;
  }
  int maxLength = str.length() - (word.length() - 1);
  for (int i = 0; i < maxLength; i++) {
    String substr = str.substring(i, i + word.length());
    if(substr.equals(word)) {
      if (i == 0) {
        result += str.substring(word.length(), word.length() + 1);
      } else if (i == maxLength - 1) {
        result += str.substring(i - 1, i);
      } else {
        result +=
          str.substring(i - 1, i) + str.substring(i + word.length(), i + word.length() + 1);
      }
    }
  }
  return result;
}

