package lang.math;

import java.util.Random;

public class RandomMain {
    public static void main(String[] args) {

//        Random random = new Random();

        // seed를 랜덤값에 사용시 항상 같은 결과가 나옴
        Random random = new Random(1);

        int randomInt    = random.nextInt();
        System.out.println(randomInt);

        double randomDouble = random.nextDouble();
        System.out.println(randomDouble);

        boolean randomBool = random.nextBoolean();
        System.out.println(randomBool);

        //범위 조회
        //1~9
        int randomRange1= random.nextInt(10);//
        System.out.println(randomRange1);

        // 1~10
        int randomRange2= random.nextInt(10) + 1;
        System.out.println(randomRange2);


    }
}
