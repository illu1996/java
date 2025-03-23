package lang.string.method;

public class StringUtilsMain2 {

    public static void main(String[] args) {
        int num = 100;
        boolean bool = true;
        String str = "Hello, Java!";

        String format = String.format("num : %d, str: %s, bool: %b,", num, bool, str);
        System.out.println(format);

        String format2 = String.format("숫자 : %.2f", 10.1234);
        System.out.println(format2);

        //pringf
        System.out.printf("숫자 : %.3f\n", 10.1234);

        String regex = "Hello, (Java!|World)";
        System.out.println("'str'이 패턴과 일치하는가? " + str.matches(regex));


    }
}
