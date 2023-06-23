package dev.lpa;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        DayOfTheWeek weekDay = DayOfTheWeek.TUESDAY;
        System.out.println(weekDay);    // TUESDAY

        for (int i = 0; i < 10; i++) {
            weekDay = getRandomDay();
            System.out.printf("Name is %s, Ordinal value = %d%n", weekDay.name(), weekDay.ordinal());

            if(weekDay == DayOfTheWeek.FRIDAY) {
                System.out.println("Found a Friday!");
            }
        }
    }

    public static DayOfTheWeek getRandomDay() {
        int randomInteger = new Random().nextInt(7);
        var allDays = DayOfTheWeek.values();
        return allDays[randomInteger];
    }
}
