package ro.sit.course03_04;
public class Main {
    public static void test(String[] args) {

     //   Circle circle = null;
     //   Circle circle = new Circle();

        Circle circle =  new Circle ();
        circle.setRadius(2.0);
        System.out.println(circle.radius);
        System.out.println(circle.getArea());
    }

}
