package lang.wrapper;

import org.w3c.dom.ls.LSOutput;

public class WrapperClassMain {

    public static void main(String[] args) {
        Integer newInteger = Integer.valueOf(10);
        System.out.println(newInteger);
        Long longObj = Long.valueOf(100);
        System.out.println(longObj);

        String newString = "Hello World";
        int intValue = newInteger.intValue();
        System.out.println(intValue);
        System.out.println(longObj.getClass().getSimpleName());
        System.out.println(((Object)intValue).getClass().getSimpleName());
        System.out.println(newString.getClass().getSimpleName());
    }

}
