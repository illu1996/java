package enumeration.ex3;

import java.util.Arrays;

public class EnumMethodMain {
    public static void main(String[] args) {

        //모든 ENUM 반환
        Grade[] values = Grade.values();
        System.out.println("values = " + Arrays.toString(values));
        for (Grade grade : values) {
            System.out.println("name = " + grade.name() + " , ordinal=" + grade.ordinal());
        }

        // String -> ENUM 변환, 잘못된 문자의 ENUM ( 없는 것 ) 을 넣으면 exception 발생
        String input = "GOLD";
        Grade NaN = Grade.valueOf(input);
        System.out.println("gold = " + NaN);


    }
}
