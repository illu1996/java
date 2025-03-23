package lang.string.builder;

//최적화가 어려운 것
public class LoopStringMain {

    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < 100000; i++) {
            result.append("Hello Java");
        }

        long endTime = System.currentTimeMillis();
        System.out.println(result);
        System.out.println("time = " + (endTime - startTime) + "ms");
    }

}
