package ro.sit.course;

public class Course01 {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        int number;
        number = 5;
        int secondNumber = 2;
        System.out.println(number);
        System.out.println(secondNumber);
        final String FIRST_NAME = "Darth Vader";

        String name;
        name = "Sidius";
        System.out.println(number + FIRST_NAME+name + secondNumber);
        int suma = number + secondNumber;
        System.out.println(suma);
        //number = 18;
        suma = number + secondNumber;
        int produs = number * secondNumber;
        System.out.println("suma este: " + (suma));
        System.out.println("produsul este:" + produs);
        System.out.println(number + "+" + secondNumber + "=" +  suma);
        System.out.println(number + "*" + secondNumber + " = " + produs);
        boolean isNegative = number < 0;
        System.out.println(isNegative);
        char caracter = 'a';
        // char se deosebeste prin string prin faptul ca are apostrof
        System.out.println("Caracterul este " + caracter);
        byte a = 127;
        byte b = 100;
        short suma2 = (short) (a + b);
        // cum sa castez ???
        System.out.println(suma2);
        String numeComplet = FIRST_NAME + " " + name;
        System.out.println(numeComplet);
        int impartire = number /secondNumber;
        System.out.println("Rezultatul impartirii este: " + impartire);
        float impartire2= (float) number / secondNumber;
        System.out.println("Rezultatul impartirii este: " + impartire2);
        int modul = number % secondNumber;
        System.out.println("Restul impartirii este: " + modul);
        modul = modul + 5;
        modul += 5;
        modul -= 3;
        modul *= 5;
        modul -= 1;
        //modul = modul * 5 - 1;
        modul = modul + 1;
        modul += 1;
        System.out.println("Inainte de operatii de incrementare/decrementare: " + modul);
//        modul++;
//        System.out.println("Post incrementare: " + modul++);
        System.out.println("Post incrementare: " + modul);
        modul = modul + 1;
        System.out.println(modul);
//        modul--;
        System.out.println("Post decrementare: " + modul--);
        System.out.println(modul);
//        ++modul;
        modul = modul + 1;
        System.out.println("Post incrementare: " + modul);
//        System.out.println("Pre incrementare: " + ++modul);
        System.out.println(modul);
//        --modul;
        System.out.println("Post decrementare: " + --modul);
        System.out.println(modul);
        boolean areEqual = number == secondNumber;
        boolean notEqual = number != secondNumber;
        System.out.println("The numbers are equal " + areEqual);
        System.out.println("The numbers are not equal " + notEqual);
        boolean areBothPositive = number >= 0 && secondNumber >= 0;
        System.out.println("Both numbers are positive " + areBothPositive);
        secondNumber = -2;
        areBothPositive = number >= 0 && secondNumber >= 0;
        System.out.println("Both numbers are positive " + areBothPositive);
        boolean eitherIsPositive = number >= 0 || secondNumber >= 0;
        System.out.println("Either number is positive " + eitherIsPositive);
        boolean reversedEitherIsPositive = !eitherIsPositive;
        System.out.println("Reversed Either number is positive " + reversedEitherIsPositive);
        boolean xorOperator = number >= 0 ^ secondNumber >= 0;
        System.out.println("XOR operator " + xorOperator);
        secondNumber = 3;

        //o condiditie nu poate fi si masa si scaun in acelasi timp
        xorOperator = number >= 0 ^ secondNumber >= 0;
        System.out.println("XOR operator " + xorOperator);
        System.out.println("First sequence");
        System.out.println("Second sequence");
        System.out.println("Third sequence");
        number = 0;
        boolean isNumberPositive = number > 0;
        boolean isNumberNegative = number < 0;
        if (isNumberPositive) {
            System.out.println("Numarul este strict mai mare decat 0");
        } else if (isNumberNegative) {
            System.out.println("Numarul este negativ");
        } else {
            System.out.println("Numarul este 0");
        }
    }
}
