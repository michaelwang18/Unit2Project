import javax.sound.sampled.Line;
import java.util.Scanner;

public class LinearEquationLogic {


    //Variables
    boolean finished = false;
    String cord1;
    int y1;
    int x1;
    String cord2;
    int y2;
    int x2;

    Scanner scan = new Scanner(System.in);
    LinearEquation calc = new LinearEquation();

    //Constructor
    public LinearEquationLogic(){

    }

    public void start(){
        while (!finished){
            welcome();
            //Calculate and reprint all info
            System.out.println("The Two Points Are: " + cord1 + " And " + cord2);
            System.out.println("The Equation Of The Line Between The Two Points Is: " + "placehold");
            System.out.println("The Slope Of The Equation Is: " + calc.findSlope(x1,y1,x2,y2));
            System.out.println("The y-Intercept Of The Equation Is: " + calc.yIntercept(x1,y1,x2,y2));
            System.out.println("The Distance Between The 2 Coordinates Is: " + calc.distanceBetween(x1,y1,x2,y2));

        }
        //"main" so to say


    }


    public void welcome(){
        System.out.println("Welcome to Linear Equation Calc \nWhat is your first coordinate");
        cord1 = scan.nextLine();
        int x1 = Integer.parseInt(cord1.substring(1,cord1.indexOf(",")));
        int y1 = Integer.parseInt(cord1.substring(cord1.indexOf(" ") + 1,cord1.indexOf(")")));
        System.out.println("What is your second coordinate?");
        cord2 = scan.nextLine();
        int x2 = Integer.parseInt(cord2.substring(1,cord2.indexOf(",")));
        int y2 = Integer.parseInt(cord2.substring(cord2.indexOf(" ") + 1,cord2.indexOf(")")));

    }




















}
