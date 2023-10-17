public class LinearEquation {

    public LinearEquation(){

    }

    public double findSlope(int x1, int y1, int x2, int y2){
        return (((double) y2 - y1)/((double) x2-x1));
    }
    public double yIntercept(int x1, int y1, int x2, int y2){
        return y1 - (findSlope(x1,y1,x2,y2) * x1);
    }

    public double distanceBetween(int x1, int y1, int x2, int y2){
        return Math.abs((findSlope(x1,y1,x2,y2) * x2 + yIntercept(x1,y1,x2,y2)) - (findSlope(x1,y1,x2,y2) * x1 + yIntercept(x1,y1,x2,y2)));

    }

}
