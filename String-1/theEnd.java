public String theEnd(String str, boolean front) {
  if (str.equals("")) {
    return "";
  }
  return (front) ? str.substring(0, 1) : str.substring(str.length() - 1);
}

