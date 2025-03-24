package lang.system;

import java.util.Arrays;

public class SystemMain {
    public static void main(String[] args) {

        //현재 밀리초 가져옴
        long currentTimeMillis = System.currentTimeMillis();
        System.out.println("currentTimeMilis = " + currentTimeMillis);

        //현재 시간 나노초 를 가져옴
        long currentTimeNanos = System.nanoTime();
        System.out.println("currentTimeNanos = " + currentTimeNanos);

        // 환경변수를 읽는다. == 운영체제
        System.out.println("getenv = " + System.getenv());

        // 시스템 속성을 읽는다. == 자바가 사용하는거
        System.out.println("proporties = " + System.getProperties());
        System.out.println("java version = " + System.getProperty("java.version"));

        //배열을 고속으로 복사한다.
        char[] originalArr = {'h', 'e', 'l', 'l', 'o'};
        char[] copiedArr = new char[5];
        System.arraycopy(originalArr, 0, copiedArr, 0, originalArr.length);

        System.out.println("originalArr = " + Arrays.toString(originalArr));
        System.out.println("copiedArr = " + Arrays.toString(copiedArr));

        System.out.println(originalArr == copiedArr);
        System.out.println(originalArr.equals(copiedArr));
        System.out.println(Arrays.equals(originalArr,copiedArr));

        //프로그램 종료
//        System.exit(0);
        System.out.println("hello");
    }
}
