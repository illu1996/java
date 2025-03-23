package lang.immutable.address;

public class ImmutableAddress {

    // 뷸뵨 객체는 수정할 수 없다.


    private final String value;

    /// 생성자
    public ImmutableAddress(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Address{" +
                "value='" + value + '\'' +
                '}';
    }
}
