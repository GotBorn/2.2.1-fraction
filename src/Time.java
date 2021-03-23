public class Time {
    int hour, min, sec;
    Time(int seconds) {
        hour = seconds / 3600;
        min = (seconds % 3600) / 60 ;
        sec = seconds % 60;
    }
    public String toString() {
        return hour + ":" + min + ":" + sec;
    }
}