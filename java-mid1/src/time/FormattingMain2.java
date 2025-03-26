package time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormattingMain2 {
    public static void main(String[] args) {
        //포맷팅
        LocalDateTime date = LocalDateTime.of(2024, 12, 31,13,30,59);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println("date = " + date);

        String formattedDateTime = date.format(formatter);
        System.out.println("날짜와 시간 포맷팅" + formattedDateTime);

        //파싱 : 문자를 날짜로 바꿔줌 포맷터와 같은  형태여야 한다.
        String dateTimeString = "2030-12-31 13:30:59";
        LocalDateTime parsedDate = LocalDateTime.parse(dateTimeString, formatter);
        System.out.println("문자열 파싱 날짜와 시간: " + parsedDate);
    }
}
