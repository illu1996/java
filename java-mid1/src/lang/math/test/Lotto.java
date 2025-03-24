package lang.math.test;

import java.util.Random;

public class Lotto {
    private final Random random = new Random();
    private int[] lottoNumbers;


    public Lotto() {
        System.out.println(
                "로또가 시작됩니다."
        );
    }
    public int[] generator(){
        lottoNumbers = new int[6];
        for (int i= 0; i < lottoNumbers.length; i++) {
            int num = random.nextInt(45) + 1;
            lottoNumbers[i] = num;

        }
        return lottoNumbers;
    }
}
