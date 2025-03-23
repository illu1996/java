package lang.immutable.address;

public class MemberMainV2 {

    public static void main(String[] args) {
        ImmutableAddress address = new ImmutableAddress("서울");

        MemberV2 memberA = new MemberV2("회원A", address);
        MemberV2 memberB = new MemberV2("회원B", address);

        //회원 A 회원 B [모두 주소 서울 사용]
        System.out.println("memberA = " + memberA);
        System.out.println("memberB = " + memberB);
        
        
        //회원 B의 주소를 부산으로 변경해야함
        //memberB.getAddress().setValue("부산");
        //컴파일 오류 남
        memberB.setAddress(new ImmutableAddress("부산"));
        System.out.println("부산 -> memberB.address");
        System.out.println("memberA = " + memberA);
        System.out.println("memberB = " + memberB);

    }
}
