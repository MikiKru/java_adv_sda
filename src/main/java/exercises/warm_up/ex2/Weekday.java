package exercises.warm_up.ex2;

public enum Weekday {
    MONDAY,         // ord 0
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;         // ord 6
    // isWeekDay()
    public boolean isWeekDay(){
        return !this.isHolliday();
    }
    // isHolliday()
    public boolean isHolliday(){
        return this == SATURDAY || this == SUNDAY;
    }
    // whichIsGrather(Weekday w)
    public boolean whichIsGreather(Weekday weekday){
        return this.ordinal() > weekday.ordinal();
    }
}
