package ro.sit.homework.homework03;

public class DrawClass {

    public static void main(String[] args) {
        if (args.length == 1) {
            drawFullShape(Integer.parseInt(args[0]));
        } else if (args.length == 2) {
            drawFullShape(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
        } else {
            System.out.println("Please add 1 or 2 arguments only");
        }
        System.out.println();
        System.out.println("--------");
        System.out.println();
        drawShapeOutline(Integer.parseInt(args[0]), Integer.parseInt(args[1]));

        printShapeName("Only Corners Rectangle");
        drawShapeCornersHomework(Integer.parseInt(args[0]), Integer.parseInt(args[1]));

        printShapeName("Only corners square Square");
        drawShapeCornersHomework2(Integer.parseInt(args[0]));

        printShapeName("Empty Square Homework Ex 3");
        drawShapeOutlineHomework3(Integer.parseInt(args[0]));

    }

    // method 1 for drawShapeOutline
//    private static void drawShapeOutline(int width, int height) {
//        printShapeName("Empty rectangle");
//        printEntireLine(height);
//        System.out.println();
//        for (int i = 1; i < width - 1; i++) {
//            System.out.print("*");
//            for (int j = 1; j < height - 1; j++) {
//                System.out.print(" ");
//            }
//            System.out.println("*");
//        }
//        printEntireLine(height);
//    }

    //    method 2 for drawShapeOutline
    private static void drawShapeOutline(int width, int height) {

        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                if (i == 0 || i == (width - 1) || j == 0 || j == (height - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    private static void drawShapeCornersHomework(int width, int height) {

        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                if ((i == 0 && (j == 0 || j == height - 1)) ||
                        (i == width - 1 && (j == 0 || j == height - 1))) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void drawShapeCornersHomework2(int squareSide) {

   /*    for (int i = 0; i < squareSide; i++) {
           for (int j = 0; j < squareSide; j++) {
                if ((i == 0 && (j == 0 || j == squareSide - 1)) ||
                        (i == squareSide - 1 && (j == 0 || j == squareSide - 1))) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        } */
        drawShapeCornersHomework(squareSide,squareSide);
    }


    public static void drawShapeOutlineHomework3(int squareSide) {

 /*       for (int i = 0; i < squareSide; i++) {
            for (int j = 0; j < squareSide; j++) {
                if (i == 0 || i == squareSide - 1 || j == 0 || j == squareSide - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }*/
        drawShapeOutline(squareSide,squareSide);
    }

    private static void drawShapeOutline(int squareSide) {
        drawShapeOutline(squareSide,squareSide);
    }

    private static void drawFullShape(int squareSide) {
        printShapeName("Square: ");
        drawFullShape(squareSide, squareSide);
        // duplicate code from drawShape with 2 parameters
//        for (int i = 0; i < squareSide; i++) {
//            printEntireLine(squareSide);
//            System.out.println();
//        }
    }

    private static void drawFullShape(int width, int height) {
        printShapeName("Rectangle: ");
        for (int i = 0; i < width; i++) {
            printEntireLine(height);
            System.out.println();
        }
//        printEntireLine();
//        String message = "2 parameters method";
//        printEntireLine(width, message + " with first parameter ar int");
//        printEntireLine(width, message + " with first parameter as String");
    }

    private static void printShapeName(String shapeName) {
        System.out.println();
        System.out.println(shapeName);
        System.out.println();
    }

    private static void printEntireLine(int numarColoane) {
        for (int j = 0; j < numarColoane; j++) {
            System.out.print("*");
        }
    }

    private static void printEntireLine(int numarColoane, String message) {
        for (int j = 0; j < numarColoane; j++) {
            System.out.print("*");
        }
        System.out.println(message);
    }

    private static void printEntireLine(String numarColoane, String message) {
        for (int j = 0; j < Integer.parseInt(numarColoane); j++) {
            System.out.print("*");
        }
        System.out.println(message);
    }

    private static void printEntireLine() {
        System.out.print("**********");
    }
}

//cand ai mai multe metode cu acelasi nume. Cand se incarca clasa noastra cu acelasi lucru;

