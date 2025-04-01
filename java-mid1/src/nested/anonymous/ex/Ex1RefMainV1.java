package nested.anonymous.ex;

import java.util.Random;

public class Ex1RefMainV1 {

    public static void main(String[] args) {
        //클래스 선언 후 사용
        hello(new Dice());
        hello(new Sum());
    }

    public static void hello(Process process){

        System.out.println("프로그램 시작");
        //코드 조각 시작
        process.run();
        //코드 조각 종료
        System.out.println("프로그램 종료");

    }
    static class Sum implements Process{

        @Override
        public void run(){
            for (int i = 0; i < 3 ; i++) {
                System.out.println("i = " + i );
            }
        }
    }
    static class Dice implements Process {

        @Override
        public void run() {
            int randomValue = new Random().nextInt(6) + 1;
            System.out.println("주사위 : " + randomValue);
        }
    }
}
