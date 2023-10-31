
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

    LinearEquation calc;

    Scanner scan = new Scanner(System.in);

    //Constructor
    public LinearEquationLogic(){

    }

    public void start(){
        while (!finished){
            welcome();
            response();
            if (x1 != x2 && y1 != y1){
                System.out.println("Enter a Coordinate for X");
                System.out.println();
            }
        }
        //"main" so to say


    }


    public void welcome(){
        System.out.println("Welcome to Linear Equation Calc \nWhat is your first coordinate");
        cord1 = scan.nextLine();
        x1 = Integer.parseInt(cord1.substring(1,cord1.indexOf(",")));
        y1 = Integer.parseInt(cord1.substring(cord1.indexOf(" ") + 1,cord1.indexOf(")")));
        System.out.println("What is your second coordinate?");
        cord2 = scan.nextLine();
        x2 = Integer.parseInt(cord2.substring(1,cord2.indexOf(",")));
        y2 = Integer.parseInt(cord2.substring(cord2.indexOf(" ") + 1,cord2.indexOf(")")));
        calc = new LinearEquation(x1,y1,x2,y2);

    }

    public void response() {
        String resp = "";
        if (x1 == x2 && y1 == y2){
            System.out.println("Same Exact Point");
        }
        if (x1 == x2 && y1 != y2) {
            System.out.println("These Points Are On The Horizontal Line X = " + x1);
        }
        if (y1 == y2 && x1 != x2) {
            System.out.println("These Points Are On The Vertical Line Y = " + y1);
        }
        if (x1 != x2 && y1 != y2) {
            System.out.println(calc.lineInfo());
        }
        //  return resp;

    }
}