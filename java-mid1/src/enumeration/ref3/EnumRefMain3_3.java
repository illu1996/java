package enumeration.ref3;


public class EnumRefMain3_3 {
    public static void main(String[] args) {

        int price =10000;

        System.out.println("BASIC : " + Grade.BASIC.discount(price));
        System.out.println("GOLD : " + Grade.GOLD.discount(price));
        System.out.println("DIAMOND : " + Grade.DIAMOND.discount(price));

        printDiscount(Grade.BASIC, price);
        printDiscount(Grade.GOLD, price);
        printDiscount(Grade.DIAMOND, price);

    }
    private static void printDiscount(Grade grade, int price) {
        System.out.println(grade.name() + " 등급의 할인 금액: " + grade.discount(price));
    }
}
