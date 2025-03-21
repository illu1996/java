package lang.object.poly;

public class ObjectPolyExam1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car();

        /// 도그가 오브젝트이므로 오브젝트에 담을 수 있다.
        /// Object o = dog ;
        dog.sound();
        car.move();
        action(dog);
        action(car);
    }
    public static void action(Object obj) {

        /// obj.sound(), obj.move() 는 불가능하다
        /// Object는 sound와 move를 가지고 있지 않으므로 불가능하다. 컴파일 오류가 난다.

        //객체에 맞는 다운 캐스팅이 필요하다
        if(obj instanceof Dog dof) {
            dof.sound();
        } else if(obj instanceof Car car) {
            car.move();
        }
    }
}
