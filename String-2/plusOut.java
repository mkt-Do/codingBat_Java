public String plusOut(String str, String word) {
  String result = "";
  String checkStr = str;
  for (;;) {
    int index = checkStr.indexOf(word);
    if (index == -1) {
      for (int i = 0; i < checkStr.length(); i++) {
        result += "+";
      }
      break;
    }
    for (int i = 0; i < index; i++) {
      result += "+";
    }
    result += word;
    checkStr = checkStr.substring(index + word.length());
  }
  return result;
}

