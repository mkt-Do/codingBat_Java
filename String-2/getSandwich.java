public String getSandwich(String str) {
  int firstBreadIndex = str.indexOf("bread");
  int lastBreadIndex = str.lastIndexOf("bread");
  if (firstBreadIndex == lastBreadIndex) {
    return "";
  }
  return str.substring(firstBreadIndex + 5, lastBreadIndex);
}

