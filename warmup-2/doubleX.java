boolean doubleX(String str) {
  int i = str.indexOf("x");
  if (i == -1) {
    return false;
  }
  return (str.length() <= i + 1)
   ? false
   : str.substring(i+1, i+2).equals("x");
}

