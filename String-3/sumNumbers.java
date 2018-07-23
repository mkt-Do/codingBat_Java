public int sumNumbers(String str) {
  String[] numberStr = str.split("[^0-9]");
  return Arrays.stream(numberStr)
    .filter(s -> !s.equals(""))
    .map(s -> Integer.parseInt(s))
    .reduce(0, (acc, v) -> acc + v);
}

