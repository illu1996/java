package lang.wrapper.test;

public class WrapperTest2 {
    public static void main(String[] args) {

        String[] array = {"1.5", "2.5", "3.0"};

        double sumArr = Double.parseDouble(array[0]) + Double.parseDouble(array[1]) +Double.parseDouble(array[2]) ;
        System.out.println(sumArr);

        double sumArray =0;
        for (String str : array)  {
            sumArray += Double.parseDouble(str);
        }
        System.out.println(sumArray);
    }
}
