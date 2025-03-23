package lang.immutable.address;


// 사이드 이펙트가 문제가 될 수 있는 상황\
public class RefMain1_3 {
    public static void main(String[] args) {
        ///참조형 변수는 하나의 인스턴스 공유 가능

        Address a = new Address("서울");
        Address b = a;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        //b.setValue("부산");
        change(b, "부산");
        System.out.println("부산 -> b");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }
    private static void change(Address address, String changeAddress) {
        System.out.println("주소값을 변경합니다. -> " + changeAddress);
        address.setValue(changeAddress);
    }
}
