package lang.object.test;

import java.awt.*;

public class RectangleMain {

    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(100, 20);
        Rectangle rectangle2 = new Rectangle(100, 20);

        System.out.println("rectangle1: " + rectangle1);
        System.out.println("rectangle2: " + rectangle2);

        System.out.println("equality :" + rectangle1.equals(rectangle2));
        System.out.println("identity :" + (rectangle1 == rectangle2));
    }
}
