package lang.object.tostring;

public class ToStringMain1 {
    public static void main(String[] args) {
        Object object = new Object();
        String string = object.toString();

        //toString() 반환값 출력
        System.out.println(string);

        System.out.println(object);
        /// println 이 내부적으로 .toString()을 붙여서 출력해준다.
    }
}
