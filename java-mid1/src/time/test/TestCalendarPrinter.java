package time.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class TestCalendarPrinter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("년도를 입력하세요: ");
        int inputYear = sc.nextInt();

        System.out.print("월을 입력하세요: ");
        int inputMonth = sc.nextInt();


        printCalender(inputYear, inputMonth);

    }

    private static void printCalender(int inputYear, int inputMonth) {
        LocalDate firstDayOfMonth = LocalDate.of(inputYear, inputMonth, 1);
        LocalDate firstDayOfNextMonth = firstDayOfMonth.plusMonths(1);

        //첫째날의 요일을 알아야함
        //그러므로 몇간 띄어야 하는지 알아야함!
        //월요일 = 1 ( 1%7 = 1 ) 일요일은 0이 됌

        int offsetWeekDays = firstDayOfMonth.getDayOfWeek().getValue() % 7;
        //요일 출력
        System.out.println("Su Mo Tu We Th Fr Sa ");

        for (int i = 0; i < offsetWeekDays; i++) {
            System.out.print("   ");
        }

        LocalDate dayIterator = firstDayOfMonth;
        while (dayIterator.isBefore(firstDayOfNextMonth)) {
            System.out.printf("%2d ", dayIterator.getDayOfMonth());
            if (dayIterator.getDayOfWeek() == DayOfWeek.SATURDAY) {
                System.out.println();
            }
            dayIterator = dayIterator.plusDays(1);
        }
    }
}
