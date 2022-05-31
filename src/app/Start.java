package app;

import java.util.Scanner;

public class Start {

    public static void main(String[] args) {
        DAY[] days = DAY.values();
        System.out.println("Please write the day name from below: ");
        for (DAY day: days) {
            System.out.println(day);
        }
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        String d = scanner.nextLine();
        try {
            DAY selectedDay = DAY.valueOf(d);
            System.out.println(selectedDay.getLabel());
        } catch (Exception ex) {
            System.out.println("Please write as provided.");
        }
    }
}
