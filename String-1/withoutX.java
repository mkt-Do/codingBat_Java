public String withoutX(String str) {
  if (str.length() < 1) {
    return "";
  }
  String result = str;
  if (result.substring(result.length() - 1).equals("x")) {
    result = result.substring(0, str.length() - 1);
  }
  if (result.startsWith("x")) {
    result = result.substring(1);
  }
  return result;
}

