public boolean xyBalance(String str) {
  StringBuffer sb = new StringBuffer(str);
  String rev = sb.reverse().toString();
  int x = rev.indexOf("x");
  int y = rev.indexOf("y");
  if (x == -1 && y == -1) {
    return true;
  } else if (y == -1) {
    return false;
  } else if (x == -1) {
    return true;
  } else if (x < y) {
    return false;
  } else {
    return true;
  }
}

