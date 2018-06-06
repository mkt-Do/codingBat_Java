public boolean hasBad(String str) {
  if (str.equals("")) {
    return false;
  }
  return str.startsWith("bad") || str.substring(1).startsWith("bad");
}

