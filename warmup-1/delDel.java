public String delDel(String str) {
  if (str.length() < 1) {
    return str;
  }
  if (str.substring(1).startsWith("del")) {
    return str.substring(0, 1) + str.substring(4);
  } else {
    return str;
  }
}

