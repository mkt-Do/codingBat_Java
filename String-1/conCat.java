public String conCat(String a, String b) {
  if (a.equals("")) {
    return b;
  }
  if (b.equals("")) {
    return a;
  }
  if (a.substring(a.length() - 1).equals(b.substring(0, 1))) {
    b = b.substring(1);
  }
  return a + b;
}

