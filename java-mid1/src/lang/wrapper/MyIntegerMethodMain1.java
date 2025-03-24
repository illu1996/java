package lang.wrapper;

public class MyIntegerMethodMain1 {

    public static void main(String[] args) {
        MyInteger value = new MyInteger(10);
        String str = value.toString();
        
        System.out.println(str);
        int i1 = value.compareTo(5);
        int i2 = value.compareTo(10);
        int i3 = value.compareTo(20);
        System.out.println("i1 = " + i1);
        System.out.println("i2 = " + i2);
        System.out.println("i3 = " + i3);

    }
    public static int compareTo(int value, int target) {
        if (value <target) {
            return -1;
        }
        else if (value > target) {
            return 1;

        }
        else {
            return 0;
        }
    }
}
