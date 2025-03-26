package time;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.time.LocalDate;

public class LocalDateMain {
    public static void main(String[] args) {
        LocalDate nowDate = LocalDate.now();
        LocalDate ofDate = LocalDate.of(2013, 11, 21);

        System.out.println(nowDate);
        System.out.println(ofDate);

        //계산 그냥 더해주면 안된다.
        // 불변이라서 무조건 반환값을 받아야 한다.
        LocalDate ofDatePlusDays = ofDate.plusDays(10);
        System.out.println("지정 날짜+10days = " + ofDate);
        System.out.println("지정 날짜+10days = " + ofDatePlusDays);
    }
}
