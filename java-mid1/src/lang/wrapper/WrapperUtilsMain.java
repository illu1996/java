package lang.wrapper;

public class WrapperUtilsMain {
    public static void main(String[] args) {

        Integer i1 = 10;
        Integer i2 = Integer.valueOf("10");
        int intValue = Integer.parseInt("10");

        int compoareResult = i1.compareTo(20);
        System.out.println("compoareResult: " + compoareResult);

        System.out.println("sum : " + Integer.sum(i1, i2));
        System.out.println("min : " + Integer.min(i1, 20));
        System.out.println("max : " + Integer.max(i1, 20));
    }
}
