public String startWord(String str, String word) {
  if (word.equals("")) {
    return "";
  }
  if (str.equals("")) {
    return "";
  }
  return str.substring(1).startsWith(word.substring(1))
    ? str.substring(0, word.length())
    : "";
}

