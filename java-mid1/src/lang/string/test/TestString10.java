package lang.string.test;

public class TestString10 {

    public static void main(String[] args) {
        String fruits = "Apple,Banana,Mango";

        String[] fruitsArray = fruits.split(",");

        for (String fruit : fruitsArray)
        {
            System.out.println(fruit);
        }

        String joinedString = String.join("->", fruitsArray);
        System.out.println(joinedString);
    }
}
