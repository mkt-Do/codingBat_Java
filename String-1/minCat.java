public String minCat(String a, String b) {
  int alen = a.length();
  int blen = b.length();
  return (alen > blen)
    ? a.substring(alen - blen) + b
    : a + b.substring(blen - alen);
}

