public String atFirst(String str) {
  if (str.length() < 2) {
    str += "@@";
  }
  return str.substring(0, 2);
}

