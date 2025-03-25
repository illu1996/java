package enumeration.ex1;

public class StringGradeEx1_1 {
    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();
        int basicPercent = discountService.discount(StringGrade.BASIC, price);
        int goldPercent = discountService.discount(StringGrade.GOLD, price);
        int diamondPercent = discountService.discount(StringGrade.DIAMOND, price);

        int vipPercent = discountService.discount("VIP", price);
        System.out.println("BASIC : " + basicPercent);
        System.out.println("GOLD : " + goldPercent);
        System.out.println("DIAMOND : " + diamondPercent);
        System.out.println("VIP : " + vipPercent);

    }

}
