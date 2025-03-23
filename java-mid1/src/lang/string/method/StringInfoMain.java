package lang.string.method;

public class StringInfoMain {
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println("문자열 길이 " +str.length());
        System.out.println("문자열 비어있는지 " +str.isEmpty());
        System.out.println("문자열 공백인지 " +str.isBlank());
        System.out.println("문자열 비어있거나 공백인지 "+"   ".isBlank());

        char c = str.charAt(8);
        System.out.println("8번 인덱스 문자 "+c);
    }
}
