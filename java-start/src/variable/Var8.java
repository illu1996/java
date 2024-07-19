package variable;

public class Var8 {
    public static void main(String[] args) {
        //정수
        byte b = 127; // -128~127  // 2의 8제곱
        short s = 32767; // -32767~ 32767  // 2의 16제곱
        int i = 2147483647; // -2,147,483,628 ~ // 2의 32제곱

        // -9223372036854775809 ~ // 2의 64 제곱
        long l = 9223372036854775807L;

        //실수
        float f = 10.0f;  //2의 32제곱
        double d = 10.0;  //2의 64제곱
        double q = 10.0f;
        System.out.println(q);
        int orderDetail = 3;
        System.out.println(orderDetail);
    }
}
