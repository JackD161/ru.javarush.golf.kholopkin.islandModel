package IslandModel.utils;
// класс отслеживающий время суток на острове
public  class DayTimer {
    int day;
    int hour;
    int minutes;

    public DayTimer()
    {
        day = 0;
        hour = 0;
        minutes = 0;
    }

    public String howTime() {
        return "С создания острова прошло " + day + " дней, " + hour + " часов, " + minutes + " минут!";
    }

    public void incrementMinutes() {
        minutes++;
        if (minutes == 60) {
            minutes = 0;
            hour++;
        }
        if (hour == 24) {
            hour = 0;
            day++;
        }
    }

    public void incrementHours() {
        hour++;
        if (hour == 24) {
            hour = 0;
            day++;
        }
    }

    public int getHour() {
        return hour;
    }
}
