package ro.sit.course03_04;

import java.awt.*;

public class Course04 {
    public static void main(String[] args) {

        CarBrands carBrands = new CarBrands("Diesel", "Dacia", "Logan");
        System.out.println("Brand" + carBrands.getBrand());

        Car car1 = new Car(carBrands, Color.blue);

        Car car2 = new Car(300f, (byte) 8,"AUDI", "A6","D", Color.RED);









    }
}
