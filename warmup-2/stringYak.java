public String stringYak(String str) {
  return Arrays.stream(str.split("yak")).reduce("", (acc, v) -> acc + v);
}

