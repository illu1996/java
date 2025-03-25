package enumeration.ex2;

public class ClassGradeEx2_2 {
    public static void main(String[] args) {
        int price =10000;

        DiscountService discountService = new DiscountService();

        //참조된 것이 아니라 새롭게 만들어졌기 때문에 없는 등급이 된다.

//        ClassGrade newClassGrade = new ClassGrade();
//        int result = discountService.discount(newClassGrade, price);
//        System.out.println(result);

        // 그러므로 외부에서 생성되지 않게 private로 막아야한다.
    }
}
