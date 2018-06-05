public String frontBack(String str) {
  int length = str.length();
  if (length == 0 || length == 1) {
    return str;
  }
  String front = str.substring(0, 1);
  String body = str.substring(1, length - 1);
  String back = str.substring(length - 1, length);
  return back + body + front;
}

