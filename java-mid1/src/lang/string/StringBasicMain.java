package lang.string;

public class StringBasicMain {
    public static void main(String[] args) {
        // int, double, boolean 은 기본형
        // String 은 참조형

        // 기본형은 소문자로 시작
        // 참조형은 대문자로 시작
        String str1 = "Hello";
        String str2 = new String("Hello");

        System.out.println(str1);
        System.out.println(str2);

        String str3 = "hello";
        String str4 = "hello";

        System.out.println(str3==str4);
        System.out.println(str3.equals(str4));

        str4 = "kk";
        System.out.println(str3==str4);

    }
}
