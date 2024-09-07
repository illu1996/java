package lang.immutable.address;

public class RefMain_1_3 {
    public static void main(String[] args) {
        Address a = new Address("서울");
        Address b = a;

        System.out.println(a);
        System.out.println(b);

        change(b,"부산");
        System.out.println(a);
        System.out.println(b);
    }

    public static void change(Address address, String changeAddress) {
        System.out.println("주소값을 변경 합니다 ");
        address.setValue(changeAddress);
    }
}
