public String everyNth(String str, int n) {
  if (str.equals("")) {
    return "";
  }
  String result = "";
  for (int i = 0; i < str.length(); i += n) {
    result += str.substring(i, i + 1);
  }
  return result;
}

