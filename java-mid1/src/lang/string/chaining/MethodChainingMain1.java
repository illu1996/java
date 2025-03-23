package lang.string.chaining;


//스트링 빌더가 메서드 체이닝 기법을 제공한다.

public class MethodChainingMain1 {
    public static void main(String[] args) {

        ValueAdder adder = new ValueAdder();
        adder.add(1);
        adder.add(2);
        adder.add(3);

        int result = adder.getValue();
        System.out.println("result: " + result);
    }
}
