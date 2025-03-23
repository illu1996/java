package lang.string.method;

public class StringComparisonMain {
    public static void main(String[] args) {
        String str1 = "Hello Java!";
        String str2 = "hello java!";
        String str3 = "Hello World!";

        System.out.println("str1 equals str2 "+str1.equals(str2));
        System.out.println("str1 equalsIgnore str2 "+str1.equalsIgnoreCase(str2));

        System.out.println("'b compareTo 'a'" + "bbc".compareTo("aa"));
        System.out.println("str1 compareTo str3 " + str1.compareTo(str3));
        System.out.println("str1 compareToIgnoreCase str2 " + str1.compareToIgnoreCase(str2));

        System.out.println("str1 starts With 'Hello' " + str1.startsWith("Hello"));
        System.out.println("str1 ends With 'Java1' " + str1.startsWith("Java1"));


    }

}
