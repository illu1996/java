package lang.immutable.test;

public class ImmutableMyDateMain {
    public static void main(String[] args) {
        ImmutableMyDate mydate1 = new ImmutableMyDate(2024, 1, 1);
        ImmutableMyDate mydate2 = mydate1;
        System.out.println(mydate1);
        System.out.println(mydate2);

        System.out.println("mydate2 모두 변경");
        mydate2 = mydate2.changeAll(2025, 12, 11);
        System.out.println(mydate1);
        System.out.println(mydate2);

        System.out.println("mydate2 년도 변경");
        mydate2 = mydate2.withYear(2026);
        System.out.println(mydate1);
        System.out.println(mydate2);

        System.out.println("mydate2 월 변경");
        mydate2 = mydate2.withMonth(111);
        System.out.println(mydate1);
        System.out.println(mydate2);

        System.out.println("mydate2 일 변경");
        mydate2 = mydate2.withDay( 999);
        System.out.println(mydate1);
        System.out.println(mydate2);
    }
}
