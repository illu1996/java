package enumeration.ex1;


public class StringGradeEx1_2 {
    public static void main(String[] args) {
        int price = 100;

        //StringGrade를 사용하세요
        DiscountService discountService = new DiscountService();
        int basicPercent = discountService.discount(StringGrade.BASIC, price);
        int goldPercent = discountService.discount(StringGrade.GOLD, price);
        int diamondPercent = discountService.discount(StringGrade.DIAMOND, price);

        int vipPercent = discountService.discount("VIP", price);

        //그래도 다른 걸 넣은걸 문제가 될 수 있다.
        //어쨌든 문자열 들어가는건 문제가 될 수 있다.

        System.out.println("BASIC : " + basicPercent);
        System.out.println("GOLD : " + goldPercent);
        System.out.println("DIAMOND : " + diamondPercent);
        System.out.println("VIP : " + vipPercent);
    }

}
