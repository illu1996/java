package nested.local;

import java.lang.reflect.Field;

public class LocalOuterV3 {

    private final int outInstanceVar = 3;



    public static void main(String[] args) {
        LocalOuterV3 localOuter = new LocalOuterV3();
        Printer printer = localOuter.process(2);
        //printer.print()를 나중에 실행한다. process()의 스택 프레임이 사라진 이후 실행
        printer.print();
        
        //추가
        System.out.println("필드 확인");
        Field[] declaredFields = printer.getClass().getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println("field = " + declaredField);
        }
    }

    public Printer process(int paramVar) {

        final int localVar = 1;

        //지역변수는 스택영역
        //스택 프레임이 종료되는 순산 함께 제거
        class LocalPrinter implements Printer {
            final int value = 0;
            @Override
            public void print() {
                System.out.println("value = " + value);

                //인스턴스는 더 오래 남아 있다
                System.out.println("localVar = " + localVar);
                System.out.println("paramVar = " + paramVar);
                System.out.println("outInstanceVar = " + outInstanceVar);
            }
        }
        LocalPrinter printer = new LocalPrinter();
        //printer.print(); // 실행하지 않고 Printer를 반환한다.
        return printer;
    }}