package labs.lab10;

public class Lab10ChildClass extends Lab10SuperClass {

    public static void main(String[] args) {
        Lab10SuperClass lb = new Lab10ChildClass();

        try {
            lb.msg();
        } catch (Exception e) {
        }
    }

    public void msg() throws ArithmeticException {
        System.out.println("Child Method Class");
    }

}
