public boolean xyzThere(String str) {
  int xyz = 0;
  int pxyz = 0;
  for (int i = 0; i < str.length() - 2; i++) {
    if (str.substring(i, i + 3).equals("xyz")) {
      xyz++;
    }
  }
  for (int i = 0; i < str.length() - 3; i++) {
    if (str.substring(i, i + 4).equals(".xyz")) {
      pxyz++;
    }
  }
  return xyz != pxyz;
}

