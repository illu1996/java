package lang.wrapper;

public class AutoboxingMain2 {
    public static void main(String[] args) {
        // 기본형 (primitive -> wrapper)
        int value = 7;

        // 오토 박싱 저절로 래퍼클래스로 바꿔줌
        Integer boxedValue = value;

        //래퍼에서 기본형
        //오토 언박싱 저절로 프리미티브로 바꿔줌
        int unboxedValue = boxedValue;

        System.out.println("boxedValue: " + boxedValue);
        System.out.println("unboxedValue: " + unboxedValue);
    }
}
