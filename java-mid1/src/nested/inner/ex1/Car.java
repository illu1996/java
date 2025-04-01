package nested.inner.ex1;

public class Car {
    private final String model;
    private final int chargeLevel;
    private final Engine engine;

    public Car(String model, int chargeLevel) {

        this.model = model;
        this.chargeLevel = chargeLevel;
        this.engine = new Engine(this);
    }

    // Engine에서만 사용하는 Method
    public String getModel() {
        return model;
    }

    public int getChargeLevel() {
        return chargeLevel;
    }

    public void start(){
        engine.start();
        System.out.println(model + " 시작 완료");
    }
}
