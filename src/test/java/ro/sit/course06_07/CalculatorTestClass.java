package ro.sit.course06_07;

import org.junit.*;


public class CalculatorTestClass {

    static double totalSum = 0;
    double result = 1;
    Calculator calculator = new Calculator();

    @Before
    public void resetResult(){

        result = 0;
    }

    @After
    public  void calculateTotalSum(){
        totalSum += result;
    }

    @AfterClass()
    public static void printTotalSum(){
        System.out.println("Total sum is: " + totalSum);
    }

    @Test
    public void testMultiplyForZero() {
        Calculator calculator = new Calculator();
        System.out.println("Initial result: " + result);
        result = calculator.compute(0, 1, "*");
        System.out.println("Result after compute: " + result);
        Assert.assertEquals(0, result, 0);
    }
    @Test()
        public void testDivideByZeroWithFail() {
        Calculator calculator = new Calculator();
        System.out.println("Initial result: " + result);
        System.out.println("It will not work cause we cannot divide by 0");
        result = calculator.compute(50, 0, "/");
        System.out.println("Result after compute: " + result);
        Assert.assertEquals(10, result, 0);
    }
    @Test(expected = IllegalArgumentException.class)
    public void testDivideByZeroWithoutFail() {
        Calculator calculator = new Calculator();
        System.out.println("Initial result: " + result);
        System.out.println("It will not work cause we cannot divide by 0");
        result = calculator.compute(50, 0, "/");
        System.out.println("Initial result: " + result);
        Assert.assertEquals(10, result, 0);
    }

    @Test()
    public void testAddition(){
        Calculator calculator = new Calculator();
        System.out.println("Initial result: " + result);
        result = calculator.compute(100, 25, "+");
        System.out.println("Initial result: " + result);
        Assert.assertEquals(125, result, 0);
    }

    @Test()
    public void testAdditionWithNegativeNumbers(){
        Calculator calculator = new Calculator();
        System.out.println("Initial result: " + result);
        result = calculator.compute(-100, -25, "+");
        System.out.println("Initial result: " + result);
        Assert.assertEquals(-125, result, 0);
    }

    @Test()
    public void testSubstractionWithNegativeNumbers(){
        Calculator calculator = new Calculator();
        System.out.println("Initial result: " + result);
        result = calculator.compute(-100, -25, "-");
        System.out.println("Initial result: " + result);
        Assert.assertEquals(-75, result, 0);
    }

    @Test()
    public void testMultiplyWithNegativeNumbers(){
        Calculator calculator = new Calculator();
        System.out.println("Initial result: " + result);
        result = calculator.compute(-11, -1, "*");
        System.out.println("Initial result: " + result);
        Assert.assertEquals(11, result, 0);
    }

    @Test()
    public void squareRoot(){
        Calculator calculator = new Calculator();
        System.out.println("Initial result: " + result);
        result = calculator.compute(25, 0, "SQRT");
        System.out.println("Initial result: " + result);
        Assert.assertEquals(5, result, 0);
    }

    @Test()
    public void squareRootWithNegative(){
        Calculator calculator = new Calculator();
        System.out.println("Initial result: " + result);
        result = calculator.compute(-100, 0, "SQRT");
        System.out.println("Initial result: " + result);
        Assert.assertEquals(-9, result, 0);
    }

    @Test()
    public void divideNegative(){
        Calculator calculator = new Calculator();
        System.out.println("Initial result: " + result);
        result = calculator.compute(9, -3, "/");
        System.out.println("Initial result: " + result);
        Assert.assertEquals(-3, result, 0);
    }

    @Test()
    public void unsupportedOperator(){
        Calculator calculator = new Calculator();
        System.out.println("Initial result: " + result);
        result = calculator.compute(9, -3, "&");
        System.out.println("Initial result: " + result);
        Assert.assertEquals(-3, result, 0);
    }

    @Test()
    public void testSubstraction(){
        Calculator calculator = new Calculator();
        System.out.println("Initial result: " + result);
        result = calculator.compute(20, 1, "-");
        System.out.println("Initial result: " + result);
        Assert.assertEquals(19, result, 0);
    }

    @Test()
    public void testMultiply(){
        Calculator calculator = new Calculator();
        System.out.println("Initial result: " + result);
        result = calculator.compute(11, 12, "*");
        System.out.println("Initial result: " + result);
        Assert.assertEquals(132, result, 0);
    }

    @Test()
    public void testDivide(){
        Calculator calculator = new Calculator();
        System.out.println("Initial result: " + result);
        result = calculator.compute(33, 3, "/");
        System.out.println("Initial result: " + result);
        Assert.assertEquals(11, result, 0);
    }
}
