public String extraEnd(String str) {
  if (str.length() < 2) {
    return str + str + str;
  }
  String repeat = str.substring(str.length() - 2, str.length());
  return repeat + repeat + repeat;
}

