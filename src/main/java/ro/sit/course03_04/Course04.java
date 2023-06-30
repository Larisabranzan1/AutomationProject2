package ro.sit.course03_04;

import java.awt.*;

public class Course04 {
    public static void main(String[] args) {

        CarBrands carBrands = new CarBrands("Diesel", "Dacia", "Logan");
        System.out.println("Brand" + carBrands.getBrand());

        Car car1 = new Car(carBrands, Color.blue);

        Car car2 = new Car(300f, (byte) 8, "AUDI", "A6", "D", Color.RED);

        car2.accelerate(10);
        System.out.println(car2);
        System.out.println("Add fuel");
        car2.setFuelLevel(80);
        car2.accelerate(20);
        System.out.println(car2);
        car2.accelerate(10);
        System.out.println(car2);

        Dealer florinD = new Dealer();
        Dealer.addCar();
        Dealer cristinaD = new Dealer();
        Dealer.addCar();
        Dealer.addCar();
// call static method
        Dealer.deleteCar();
        Dealer.nrOfCars++;


        System.out.println("Number of cars Florin:" + florinD.getNrOfCars());
        System.out.println("Number of cars Florin:" + cristinaD.getNrOfCars());

        Double nr = Double.parseDouble("56");
        System.out.println(nr);

        Shape shape = new Shape();
        shape.draw();
        Circle circle = new Circle();
        circle.draw();
        circle.protectedMthCircle();
        Triangle triangle = new Triangle(Color.CYAN);
        triangle.draw();
        triangle.draw(6,8,10);

        //Polymorphism
        Shape shape3 = new Shape(Color.RED);
        Shape shape1 = new Circle(Color.BLUE, 2);
        Shape shape2 = new Triangle(Color.BLACK);
        Shape shape4 = new EqTriangle(Color.CYAN);;

        System.out.println("Polymorphism");
        shape1.draw();
        shape2.draw();
        triangle.flipHorizontal();
        shape4.draw();

    }
}