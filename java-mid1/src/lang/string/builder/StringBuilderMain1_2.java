package lang.string.builder;

//스트링 빌더는 가변이고, 스트링은 불변이다.
public class StringBuilderMain1_2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("A");
        sb.append("B");
        sb.append("C");
        sb.append("D");
//        메서드 체이닝
//        sb.append("A").append("B").append("C").append("D");
        System.out.println("sb = " + sb);

        sb.insert(4, "Java");
        System.out.println("insert = " + sb);

        sb.delete(4,8);
        System.out.println("delete = " + sb);

        sb.reverse();
        System.out.println("reverse = " + sb);

        //stringbuilder -> String
        String string = sb.toString();
        System.out.println("string = " + string);
    }
}
