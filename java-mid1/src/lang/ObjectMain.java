package lang;

import lang.object.Child;
import lang.object.Parent;

public class ObjectMain {
    public static void main(String[] args) {
        Child child = new Child();
        Parent parent = new Parent();
        child.childMethod();
        child.parentMethod();


        /// 객체의 정보를 변수인 string 에 담아 놓는다.
        String string = child.toString();
        String string2 = parent.toString();
        System.out.println(string);
        System.out.println(string2);
    }
}
