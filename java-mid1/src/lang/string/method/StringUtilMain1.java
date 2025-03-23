package lang.string.method;

public class StringUtilMain1 {
    public static void main(String[] args) {
        int num = 100;
        boolean bool = true;

        Object obj = new Object();
        String str = "Hello, Java!";

        String numbString = String.valueOf(num);
        System.out.println("숫자의 문자열 값 : " + numbString);
        String boolString = String.valueOf(bool);
        System.out.println("숫자의 문자열 값 : " + boolString);
        String objString = String.valueOf(obj);
        System.out.println("숫자의 문자열 값 : " + objString);

        //문자 + 무엇이든 -> 문자가 됨
        String numString2 = "" + num;
        System.out.println(numString2);

        // toCharArray 문자열을 배열로 변환
        char[] strCharArray = str.toCharArray();
        System.out.println(strCharArray);
        for (char c : strCharArray) {
            System.out.printf(c + "");
        }
    }
}
