package enumeration.ref2;

import enumeration.ref1.ClassGrade;

public class DiscountService {
    public int discount(Grade grade, int price) {
        return price * grade.getDiscountPercent() / 100;
    }
}
