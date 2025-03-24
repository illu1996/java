package lang.math.test;

import java.util.Arrays;

public class LottoMain {
    public static void main(String[] args) {

        Lotto lotto = new Lotto();
        int[] numbers = lotto.generator();

        System.out.println(Arrays.toString(numbers));
    }
}
