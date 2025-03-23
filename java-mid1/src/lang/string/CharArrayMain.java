package lang.string;

import java.util.Arrays;

public class CharArrayMain {
    public static void main(String[] args) {
        char a = '가';
        //불가 타입으로 인해
        //char b = '가나다';
        System.out.println("a = " + a);

        char[] charArr = new char[]{'h','e','l','l','o'};
        System.out.println(charArr);

        String string = "Hello World";
        System.out.println(string);
    }
}
