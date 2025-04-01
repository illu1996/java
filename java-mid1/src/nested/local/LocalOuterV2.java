package nested.local;

import java.awt.print.Printable;

public class LocalOuterV2 {

    private final int outInstanceVar = 3;

    public static void main(String[] args) {
        LocalOuterV2 localOuterV1 = new LocalOuterV2();
        localOuterV1.process(2);
    }

    public void process(int paramVar) {

        int localVar = 1;

        class LocalPrinter implements Printer {
            final int value = 0;
            @Override
            public void print() {
                System.out.println("value = " + value);
                System.out.println("localVar = " + localVar);
                System.out.println("paramVar = " + paramVar);
                System.out.println("outInstanceVar = " + outInstanceVar);
            }
        }
        LocalPrinter printer = new LocalPrinter();
        printer.print();

        }
    }
