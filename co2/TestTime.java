class Time {
    int hours;
    int minutes;

    Time(int h, int m) {
        hours = h;
        minutes = m;
    }

    Time addTime(Time t) {
        int totalMinutes = this.minutes + t.minutes;
        int totalHours = this.hours + t.hours + totalMinutes / 60;
        totalMinutes = totalMinutes % 60;
        return new Time(totalHours, totalMinutes);
    }

    void display() {
        System.out.println(hours + " hours " + minutes + " minutes");
    }
}

public class TestTime {
    public static void main(String[] args) {
        Time t1 = new Time(2, 45);
        Time t2 = new Time(1, 30);
        Time t3 = t1.addTime(t2);
        t3.display();
    }
}
