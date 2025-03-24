package lang.math;

import java.util.regex.MatchResult;

public class MathMain {
    public static void main(String[] args) {

        //최대 최소 절대값
        System.out.println("max(10, 20) : " + Math.max(10,20));
        System.out.println("min(10, 20) : " + Math.min(10,20));
        System.out.println("abs(10, 20) : " + Math.abs(-10));

        // 반올림 정밀도
        System.out.println("ceil(2.1) : " + Math.ceil(2.1));
        System.out.println("floor(2.1) : " + Math.floor(2.1));
        System.out.println("round(2.1) : " + Math.round(2.5));

        //기타 유용한 메서드
        System.out.println("sqrt(4) : " + Math.sqrt(4)); //제곱근
        System.out.println("random() : " + Math.random()); // 0.0~1.0 사이의 double 값

        //빅 데시멀 Big Decimal
        // 아주 정밀한 숫자와 반올림 계산이 필요할 시 사용

    }
}
