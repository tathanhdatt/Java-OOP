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

  public String toString() {
    String hour = this.hour < 10 ?
      String.format("0%d", this.hour) :
      String.valueOf(this.hour);
    String minute = this.minute < 10 ?
      String.format("0%d", this.minute) :
      String.valueOf(this.minute);
    String second = this.second < 10 ?
      String.format("0%d", this.second) :
      String.valueOf(this.second);
    return String.format("%s:%s:%s", hour, minute, second);
  }

  public Time nextSecond() {
    this.second = (this.second == 59) ? 0 : (this.second + 1);
    if (this.second == 0) {
      this.minute = this.minute == 59 ? 0 : (this.minute + 1);
    }
    if (this.minute == 0 && this.second == 0) {
      this.hour = this.hour == 23 ? 0 : (this.hour + 1);
    }

    return this;
  }

  public Time previousSecond() {
    this.second = (this.second == 0) ? 59 : (this.second - 1);
    if (this.second == 59) {
      this.minute = this.minute == 0 ? 59 : (this.minute - 1);
    }
    if (this.minute == 59 && this.second == 59) {
      this.hour = this.hour == 0 ? 23 : (this.hour - 1);
    }

    return this;
  }
}
