package utils;
// класс отслеживающий время суток на острове
public class DayTimer {
    int day;
    int hour;
    int minut;

    public DayTimer()
    {
        day = 0;
        hour = 0;
        minut = 0;
    }

    public String howTime() {
        return "С создания острова прошло " + day + " дней, " + hour + " часов, " + minut + " минут!";
    }

    public void incrementMinutes() {
        minut++;
        if (minut == 60) {
            minut = 0;
            hour++;
        }
        if (hour == 24) {
            hour = 0;
            day++;
        }
    }

    public int getHour() {
        return hour;
    }
}
