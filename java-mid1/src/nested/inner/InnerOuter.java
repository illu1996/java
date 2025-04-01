package nested.inner;

public class InnerOuter {
    private static final int outClassValue = 3;
    private final int outInstanceValue = 2;

    class Inner {
        private final int innerInstanceValue = 1;

        public void print(){
            //클래스 내부
            System.out.println(innerInstanceValue);

            //바깥 클래스 인스턴스
            System.out.println(outInstanceValue);
            System.out.println(outClassValue);
        }
    }
}
