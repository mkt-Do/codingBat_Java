public boolean nearTen(int num) {
  return Math.min(Math.abs(10 - (num % 10)), (num % 10)) <= 2;
}

