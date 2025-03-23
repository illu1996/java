package lang.string.equals;

public class StringEqaulsMain1 {
    public static void main(String[] args) {

        // String str1 = new String("Hello World");
        // String str2 = new String("Hello World");
        // System.out.println("== 비교 " + str1 == str2);
        // System.out.println("eqauls 비교 " +str1.equals(str2));

        String str3 = "Hello World";
        String str4 = "Hello World";

        // 객체 참조식일때 == 비교는 false가 나와야 하지만
        // 자바가 실행될때, 문자열 pool을 만들어 놓기 때문에
        // 메모리 효율을 높이고, 문자만드는 시간을 줄이기 때문에 효율적이다.
        // 그러므로 같은 참조값을 본다고 본다.
        System.out.println("리터럴 == 비교 " + (str3 == str4));
        System.out.println("리터럴 == 비교 " + str3.equals(str4));
    }
}
