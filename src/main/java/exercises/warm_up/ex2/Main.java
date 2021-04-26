package exercises.warm_up.ex2;

public class Main {
    public static void main(String[] args) {
        System.out.println(Weekday.FRIDAY.isHolliday());
        System.out.println(Weekday.FRIDAY.isWeekDay());
        System.out.println(
                Weekday.MONDAY.whichIsGreather(Weekday.SATURDAY));
    }
}
