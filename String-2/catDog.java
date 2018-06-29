public boolean catDog(String str) {
  int cntCat = 0;
  int cntDog = 0;
  for (int i = 0; i < str.length() - 2; i++) {
    String substr = str.substring(i, i + 3);
    if (substr.equals("cat")) {
      cntCat++;
    } else if (substr.equals("dog")) {
      cntDog++;
    }
  }
  return cntCat == cntDog;
}

