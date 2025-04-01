package nested.nested;

import java.sql.SQLOutput;

public class NestedOuter {

    private static final int outClassValue = 3;
    private final int outInstanceValue = 2;

    static class Nested {
        private final int nestedInstanceValue = 1;

        public void print(){

            //자신 멤버에 접근
            System.out.println(nestedInstanceValue);

            //바깥 클래스의 인스턴스 멤버 접근 불가
            //System.out.println(outInstanceValue);

            //바깥 클래스의 클래스 멤버는 접근 가능하다.
            //private 여도 가능하다.
            System.out.println(outClassValue);
        }
    }
}
