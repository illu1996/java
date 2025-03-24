package lang.wrapper;

/// 자바의 기본형의 한계를 이겨내기 위해 기본형을 감싼 레퍼 클래스
public class MyInteger {
    private final int value;

    public MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public int compareTo(int target) {
        if (value == target) {
            return 0;

        }else if (value > target) {
            return 1;

        }else{
            return -1;
        }

    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
