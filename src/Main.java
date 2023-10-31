
public class Main {
    public static void main(String[] args) {
        System.out.println("-------------- TESTING: CORRECT METHOD NAMING & RETURN VALUES --------------");
        int x1 = -1;
        int y1 = 5;
        int x2 = 3;
        int y2 = 10;
        LinearEquation equation = new LinearEquation(x1, y1, x2, y2);
        System.out.println("Equation: " + equation.equation());
        System.out.println("Slope: " + equation.getSlope());
        System.out.println("y-intercept: " + equation.getYIntercept());
        System.out.println("Distance: " + equation.getDistance());
        System.out.println();
        System.out.println("----- Line info -----");
        System.out.println(equation.lineInfo());
        System.out.println();
        double testX = 4;
        System.out.println("Coordinate for x: " + equation.coordinateForX(testX));
        System.out.println("-------------- TESTING: START METHOD BEGINS PROGRAM --------------");
        LinearEquationLogic logic = new LinearEquationLogic();
        logic.start();


        System.out.println("-------------- TESTING: REQUIRED TEST CASES --------------");
        LinearEquation eq1 = new LinearEquation(-1, 5, 3, 10); // good for 5/4 slope
        LinearEquation eq2 = new LinearEquation(-6, -2, 1, -1); // good for 1/7 slope
        LinearEquation eq3 = new LinearEquation(2, 10, -1, 3); // good for 7/3 slope
        LinearEquation eq4 = new LinearEquation(-1, 4, -7, 12); // good for -8/6 slope
        LinearEquation eq5 = new LinearEquation(1, 4, 7, 12); // good for 8/6 slope
        LinearEquation eq12 = new LinearEquation(3, 12, 7, 2); // good for -10/4 slope
        LinearEquation eq13 = new LinearEquation(7, 12, 3, 2); // good for 10/4 slope
        LinearEquation eq14 = new LinearEquation(7, 12, 3, 12); // good for horizontal
        LinearEquation eq15 = new LinearEquation(16, -2, 3, -2); // good for horizontal
        System.out.println(eq1.equation());
        System.out.println(eq2.equation());
        System.out.println(eq3.equation());
        System.out.println(eq4.equation());
        System.out.println(eq5.equation());
        System.out.println(eq12.equation());
        System.out.println(eq13.equation());
        System.out.println(eq14.equation());
        System.out.println(eq15.equation());
