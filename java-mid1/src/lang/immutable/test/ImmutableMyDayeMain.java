package lang.immutable.test;

public class ImmutableMyDayeMain {

    public static void main(String[] args) {
        ImmutableMyDate date1 = new ImmutableMyDate(2024, 1, 1);


        System.out.println(date1);

        System.out.println("2025로 바꾸기");
        date1.setYear(2025);

        System.out.println(date1);

        System.out.println("2025로 바꾸기");
        ImmutableMyDate date2= date1.setYear(2025);
        System.out.println(date1);
        System.out.println(date2);


    }
}
