package lang.immutable.address;

public class MemberMainV1 {

    public static void main(String[] args) {
        Address address = new Address("서울");

        MemberV1 memberA = new MemberV1("회원A", address);
        MemberV1 memberB = new MemberV1("회원B", address);

        System.out.println("멤버 A" + memberA);
        System.out.println("멤버 B" + memberB);

        //멤버 비의 주소를 바꾸자

        memberB.getAddress().setValue("부산");
        System.out.println("멤버 A" + memberA);
        System.out.println("멤버 B" + memberB);
    }
}
