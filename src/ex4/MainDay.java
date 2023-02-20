package ex4;

public class MainDay {
    public static void main(String[] args) {
        DayWeek dayWeek = new DayWeek(Day.Monday);
        dayWeek.DaySchedule();
        DayWeek dayWeek1 = new DayWeek(Day.Tuesday);
        dayWeek1.DaySchedule();
        DayWeek dayWeek2 = new DayWeek(Day.Wednesday);
        dayWeek2.DaySchedule();
        DayWeek dayWeek3 = new DayWeek(Day.Thursday);
        dayWeek3.DaySchedule();
        DayWeek dayWeek4 = new DayWeek(Day.Friday);
        dayWeek4.DaySchedule();
        DayWeek dayWeek5 = new DayWeek(Day.Saturday);
        dayWeek5.DaySchedule();
        DayWeek dayWeek6 = new DayWeek(Day.Sunday);
        dayWeek6.DaySchedule();
    }
}
