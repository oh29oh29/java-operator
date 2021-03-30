class Parent {}
class Child extends Parent {}

/**
 * 해당 클래스는 instanceof 를 확인하기 위하여 작성되었다.
 * */
public class InstanceofStudy {

    public static void main(String[] args) {
        Parent parent = new Parent();
        Child child = new Child();

        System.out.println("child is instance of Child: " + (child instanceof Child));
        System.out.println("child is instance of Parent: " + (child instanceof Parent));
        System.out.println("child is instance of Object: " + (child instanceof Object));

        System.out.println("parent is instance of Child: " + (parent instanceof Child));
        System.out.println("parent is instance of Parent: " + (parent instanceof Parent));
        System.out.println("parent is instance of Object: " + (parent instanceof Object));
    }

}
