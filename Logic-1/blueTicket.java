public int blueTicket(int a, int b, int c) {
  int ab = a + b;
  int bc = b + c;
  int ca = c + a;
  if (ab == 10 || bc == 10 || ca == 10) {
    return 10;
  } else if (Math.abs(ab - bc) >= 10 || Math.abs(ab - ca) >= 10) {
    return 5;
  } else {
    return 0;
  }
}

