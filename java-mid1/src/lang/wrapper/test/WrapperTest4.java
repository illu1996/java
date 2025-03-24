package lang.wrapper.test;

public class WrapperTest4 {
    public static void main(String[] args) {
        String str = "100";

        Integer integerVal1 = Integer.valueOf(str);
        System.out.println(integerVal1);

        int intVal = integerVal1;
        System.out.println(intVal);

        Integer integerVal2 = intVal;
        System.out.println(integerVal2);
    }
}
