package operator;

public class Operator2 {
    public static void main(String[] args) {
        // 문자열과 문자열 더하기
        String result1=  "Hello" + "world";
        System.out.println(result1);

        String s1 = "string1";
        String s2 = "string2";
        System.out.println(s1 + s2);

        String s3 = "a + b = " + 10; //자바가 형변환을 통해 숫자를 문자로 바꿈
        System.out.println(s3);


    }
}
