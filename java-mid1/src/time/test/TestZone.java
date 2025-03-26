package time.test;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TestZone {
    public static void main(String[] args) {
        ZonedDateTime seoulTime = ZonedDateTime.of(LocalDate.of(2024, 1, 1), LocalTime.of(9, 12), ZoneId.of("Asia/Seoul"));
        ZonedDateTime londonTime = seoulTime.withZoneSameInstant(ZoneId.of("Europe/London"));
        ZonedDateTime americaTime = seoulTime.withZoneSameInstant(ZoneId.of("America/New_York"));

        System.out.println("서울 회의시간: " + seoulTime);
        System.out.println("미국 회의시간: " + americaTime);
        System.out.println("영국 회의시간: " + londonTime);


    }
}
