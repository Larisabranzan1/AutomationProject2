package ro.sit.course03_04;

import java.awt.*;

public class Car {


    CarBrands carBrand;

    private CarBrands carBrands;
    private float fuelLevel;
    private byte gear;
    private float speed;
    private Color color;
    private boolean engineOn;

    public Car(CarBrands carBrand, Color color) {
        this.carBrand = carBrand;
        this.color = color;
    }

    public Car(float maxSpeed, byte maxGear, String brand, String model, String fuelType, Color color) {
        this.carBrand = new CarBrands(maxSpeed, maxGear, brand, model, fuelType);
        this.color = color;
    }

    public void accelerate(float speedDelta) {}

    public void steer(float angle) {}

    public void gearUp() {}

    public CarBrands getCarBrand() {
        return carBrand;
    }

    public float getFuelLevel() {
        return fuelLevel;
    }

    public byte getGear() {
        return gear;
    }

    public float getSpeed() {
        return speed;
    }

    public Color getColor() {
        return color;
    }

    public boolean isEngineOn() {
        return engineOn;
    }
}
