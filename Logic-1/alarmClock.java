public String alarmClock(int day, boolean vacation) {
  if (vacation && (day == 0 || day == 6)) {
    return "off";
  } else if (vacation || (day == 0 || day == 6)) {
    return "10:00";
  } else {
    return "7:00";
  }
}

