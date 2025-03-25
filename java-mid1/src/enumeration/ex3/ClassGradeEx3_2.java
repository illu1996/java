package enumeration.ex3;


public class ClassGradeEx3_2 {
    public static void main(String[] args) {
        int price =10000;
        DiscountService discountService = new DiscountService();

        // enum 타입은 외부 생성 불가!!!!

//        Grade newClassGrade = new Grade();
//        int result = discountService.discount(newClassGrade, price);
//        System.out.println(result);

        // 그러므로 외부에서 생성되지 않게 private로 막아야한다.
    }
}
