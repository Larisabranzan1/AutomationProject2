package ro.sit.course03_04;

public class CarBrands {

    private  float maxSpeed = 240;

    private byte maxGear = 6;

    private String fuelType;
    private String brand;
    private String model;
    public CarBrands(String fuelType, String brand, String model) {
        this.fuelType = fuelType;
        this.brand = brand;
        this.model = model;
    }


    public CarBrands(float maxSpeed, byte maxGear, String fuelType, String brand, String model) {
        this.maxSpeed = maxSpeed;
        this.maxGear = maxGear;
        this.fuelType = fuelType;
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return this.brand;
    }

    public float getMaxSpeed() {
        return maxSpeed;
    }

    public byte getMaxGear() {
        return maxGear;
    }

    public String getFuelType() {
        return fuelType;
    }

    public String getModel() {
        return model;
    }
}
