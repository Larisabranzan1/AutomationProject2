package ro.sit.course;

public class SumOfNumbers {
    public static void main(String [] args) {
        int sum=0;
        int number = 100;
        for (int i=1; i<=100; i++) {
            sum = sum + i;
        }
        System.out.println("Sum of first 100 numbers is:" +sum);
    }
}

