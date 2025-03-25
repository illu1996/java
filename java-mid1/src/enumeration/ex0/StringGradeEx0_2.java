package enumeration.ex0;

public class StringGradeEx0_2 {
    public static void main(String[] args) {
        int price = 100;

        DiscountService discountService = new DiscountService();
        int basicPercent = discountService.discount("BASIC", price);
        int goldPercent = discountService.discount("GOLD", price);
        int diamondPercent = discountService.discount("DIAMOND", price);

        // enum이 필요한 경우
        // 존재하지 않는 등급 입력시
        // 등급의 오타
        // 대문자 대신 소문자 입력

        // String 만을 사용시 안정성 부족
        // 컴파일 시 문제 발견 못함. 런타임에서만 가능하다.

        int vipPercent = discountService.discount("VIP", price);


        System.out.println("BASIC : " + basicPercent);
        System.out.println("GOLD : " + goldPercent);
        System.out.println("DIAMOND : " + diamondPercent);
        System.out.println("VIP : " + vipPercent);
    }

}
