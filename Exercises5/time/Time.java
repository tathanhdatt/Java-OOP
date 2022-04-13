package time;

public class Time {
  private int hour;
  private int minute;
  private int second;

  public Time(int hour, int minute, int second) {
    this.hour = hour;
    this.minute = minute;
    this.second = second;
  }

  public int getHour() {
    return hour;
  }

  public void setHour(int hour) {
    this.hour = hour;
  }

  public int getMinute() {
    return minute;
  }

  public void setMinute(int minute) {
    this.minute = minute;
  }

  public int getSecond() {
    return second;
  }

  public void setSecond(int second) {
    this.second = second;
  }

  public void setTime(int hour, int minute, int second) {
    this.hour = hour;
    this.minute = minute;
    this.second = second;
  }

  @Override
  public String toString() {
    String hour = this.hour < 10 ? ("0" + this.hour) : String.valueOf(this.hour);
    String minute = this.minute < 10 ? ("0" + this.minute) : String.valueOf(this.minute);
    String second = this.second < 10 ? ("0" + this.second) : String.valueOf(this.second);
    return String.format("%s:%s:%s", hour, minute, second);
  }

  public Time nextSecond() {
    second = (second == 59) ? 0 : (second + 1);
    if (second == 0) {
      minute = minute == 59 ? 0 : (minute + 1);
    }
    if (minute == 0 && second == 0) {
      hour = hour == 23 ? 0 : (hour + 1);
    }

    return this;
  }

  public Time previousSecond() {
    second = (second == 0) ? 59 : (second - 1);
    if (second == 59) {
      minute = minute == 0 ? 59 : (minute - 1);
    }
    if (minute == 59 && second == 59) {
      hour = hour == 0 ? 23 : (hour - 1);
    }

    return this;
  }
}
