public class LinearEquation {
    private int x1;
    private int x2;
    private int y1;
    private int y2;

    private double slope;
    private double yIntercept;

    private double distance;



    public LinearEquation(int x1, int y1, int x2, int y2){
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
        slope = (((double) y2 - y1)/((double) x2-x1));
        yIntercept = (y1 - slope * x1);
        distance = Math.abs((slope * x2 + yIntercept) - (slope * x1 + yIntercept));
    }

    public double coordinateForX(double xval){
        return slope * xval + yIntercept;
    }
    public String equation(){
        int xx = x2 - x1;
        int yy = y2 - y1;
        String coeff = " ";
        String mx = Math.abs(yy) + "/" + Math.abs(xx);
        String firstHalf = "";
        String plus = "";
        String b = String.valueOf(getYIntercept());
        double slopeValue = slope;
        if (slopeValue == getSlope()){
            mx = String.valueOf(slopeValue);
        }

        if (slopeValue == 1){
            mx = "";
        }

        if (xx < 0 || yy < 0){
            coeff = "-";
        }
        if (xx < 0 && yy < 0){
            coeff = "";
        }

        if (yIntercept == 0){
            b = "";
        }

        if (slopeValue != 0){
            firstHalf = "" + coeff + mx + "x";
        }

        if (slopeValue != 0 && yIntercept != 0){
            plus = " + ";
        }

        if (slopeValue == 0 && yIntercept == 0){
            return "y = 0";
        }

        if (firstHalf.indexOf("--") != -1){
            firstHalf = firstHalf.substring(1);
        }

        return "y = " + firstHalf + plus + b;
    }

    public double getSlope() {return roundto100th(slope);}
    public double getYIntercept(){return roundto100th(yIntercept);}
    public double getDistance(){return roundto100th(distance);}

    public double roundto100th(double num){ return (double) (Math.round(Math.round(num * 1000)) / 100) /10; }

    public String lineInfo() {
        String resp = "The Two Points Are: (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ")" + "\n";
        resp += "The Equation Of The Line Between The Two Points Is: " + equation() + "\n";
        resp += "The Slope Of The Equation Is: " + getSlope() + "\n";
        resp += "The y-Intercept Of The Equation Is: " + getYIntercept() + "\n";
        resp += "The Distance Between The 2 Coordinates Is: " + getDistance() + "\n";

        return resp;
    }

}
