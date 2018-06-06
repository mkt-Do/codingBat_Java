public String withoutX2(String str) {
  if (str.length() < 2) {
    if (str.equals("x")) {
      return "";
    }
    return str;
  }
  String result = str;
  if (result.substring(1).startsWith("x")) {
    result = result.substring(0, 1) + result.substring(2);
  }
  if (result.startsWith("x")) {
    result = result.substring(1);
  }
  return result;
}

