package ro.sit.course03;

public class Methods {

    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int c = 20;
        int d = 15;

        int sumaAb = suma(a, b);
        int sumaCd = suma(c, d);

        System.out.println("sumaAb= " + sumaAb);
        System.out.println("sumaCd= " + sumaCd);
    }

    private static int suma(int firstNumber, int secondNumber){
            return firstNumber + secondNumber;

        }

}
