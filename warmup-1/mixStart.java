public boolean mixStart(String str) {
  if (str.length() < 3) {
    return false;
  }
  String start = str.substring(1, 3);
  return start.equals("ix");
}


