package ex4;

public class DayWeek {
    Day day;

    public DayWeek(Day day) {
        this.day = day;
    }

    public void DaySchedule(){
        switch (day) {
            case Monday -> System.out.println("Taiat iarba");
            case Tuesday -> System.out.println("Arat gradina");
            case Wednesday -> System.out.println("Fotbal");
            case Thursday -> System.out.println("Inot");
            case Friday -> System.out.println("Vioara");
            case Saturday -> System.out.println("Fotbal");
            case Sunday -> System.out.println("Fotbal");
        }
    }
}
