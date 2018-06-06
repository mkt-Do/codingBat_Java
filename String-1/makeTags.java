public String makeTags(String tag, String word) {
  if (tag.equals("")) {
    return word;
  }
  return "<" + tag + ">" + word + "</" + tag + ">";
}

