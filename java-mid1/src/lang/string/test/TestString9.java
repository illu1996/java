package lang.string.test;

public class TestString9 {
    public static void main(String[] args) {

        String email = "hello@example.com";

        String ID = email.split("@")[0];
        String address = email.split("@")[1];

        System.out.println(ID);
        System.out.println(address);
    }
}
