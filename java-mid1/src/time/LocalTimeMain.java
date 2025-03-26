package time;

import java.time.LocalTime;

public class LocalTimeMain {
    public static void main(String[] args) {
        LocalTime nowTime = LocalTime.now();
        System.out.println("현재시간 : " +nowTime);
        LocalTime ofTime = LocalTime.of(9, 59, 59);
        System.out.println("지정 시간 : " + ofTime);

        // 더하기 계산 (불변
        LocalTime ofTimePlusTime = ofTime.plusSeconds(59);
        System.out.println("지정 시간 + 9h 59m 59s : " + ofTimePlusTime);

    }
}
