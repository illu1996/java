package enumeration.ex0;

public class StringGradeEx0_1 {
    public static void main(String[] args) {
        int price = 100;

        DiscountService discountService = new DiscountService();
        int basicPercent = discountService.discount("BASIC", price);
        int goldPercent = discountService.discount("GOLD", price);
        int diamondPercent = discountService.discount("DIAMOND", price);

        System.out.println("BASIC : " + basicPercent);
        System.out.println("GOLD : " + goldPercent);
        System.out.println("DIAMOND : " + diamondPercent);

    }

}
