package enumeration.ex3;

public class EnumRefMain {
    public static void main(String[] args) {

        System.out.println("class BASIC = " + Grade.BASIC.getClass());
        System.out.println("class GOLD = " + Grade.GOLD.getClass());
        System.out.println("class DIAMOND = " + Grade.DIAMOND.getClass());

        System.out.println("ref Basic = " + Grade.BASIC);
        System.out.println("ref Gold = " + Grade.GOLD);
        System.out.println("ref Diamond = " + Grade.DIAMOND);

        System.out.println("ref Basic = " + refValue(Grade.BASIC));
        System.out.println("ref Gold = " + refValue(Grade.GOLD));
        System.out.println("ref Diamond = " + refValue(Grade.DIAMOND));

    }
    private static String refValue(Grade grade) {
        return Integer.toHexString(System.identityHashCode(grade));
    }
}
