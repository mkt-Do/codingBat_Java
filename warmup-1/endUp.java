public String endUp(String str) {
  String result = "";
  int length = str.length();
  if (length < 3) {
    result = str.toUpperCase();
  } else {
    result = str.substring(0, length - 3);
    String upperTail = str.substring(length - 3).toUpperCase();
    result += upperTail;
  }
  return result;
}

