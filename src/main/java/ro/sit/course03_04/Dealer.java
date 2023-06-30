package ro.sit.course03_04;

public class Dealer {



    public static int nrOfCars;

    public static void addCar(){
        nrOfCars++;
    }

    public static void deleteCar(){
        nrOfCars--;
    }

    public static void setNrOfCars(int nrOfCars) {
        Dealer.nrOfCars = nrOfCars;
    }

    public int getNrOfCars() {
        return nrOfCars;
    }

}
