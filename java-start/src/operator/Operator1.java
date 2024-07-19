package operator;

public class Operator1 {
    public static void main(String[] args) {
        int a =5 ;
        int b = 2;
        double c= 2.0;

        int sum = a + b;
        System.out.println("a+b = " + sum); // a+b = 7

        int diff = a - b;
        System.out.println("a-b = " + diff);

        int multiply = a * b;
        System.out.println("a*b = " + multiply);

        double div = a / c;
        System.out.println("a/c = " + div);

        int mod = a%b ;
        System.out.println("a%b = " + mod);
        
        // 0으로 남은 나머지 예외 발생
        // 예외 발생시 프로그램 터짐
        // 그 이후 코드 실행 안됨
        
    }
}
