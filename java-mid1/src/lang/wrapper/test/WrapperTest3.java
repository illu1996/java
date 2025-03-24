package lang.wrapper.test;

public class WrapperTest3 {
    public static void main(String[] args) {
        String str = "100";

        Integer integerVal1 = Integer.valueOf(str);
        System.out.println(integerVal1);

        int intVla = integerVal1.intValue();
        System.out.println(intVla);

        Integer integerVal2 = Integer.valueOf(str);
        System.out.println(integerVal2);
    }
}
