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

    public double coordinateForX(int xval){
        return slope * xval + yIntercept;
    }
    public String equation(){
        int xx = x2 - x1;
        int yy = y2 - y1;
        String coeff = " ";
        String mx = xx + "/" + yy;
        String b = String.valueOf(yIntercept);
        double slopeValue = slope;
        if (slopeValue == (int)(slopeValue * 100)/100.0){
            mx = String.valueOf(slopeValue);
        }

        if (xx < 0 || yy < 0){
            coeff = "-";
        }
        if (xx < 0 && yy < 0){
            coeff = " ";
        }

        if (yIntercept == 0){
            b = "";
        }

        return coeff + mx + "+" + b;
    }

    public double getSlope() {return slope;}
    public double getYIntercept(){return yIntercept;}
    public double getDistance(){return distance;}

    public double roundto100th(double num){
        return Math.round(num * 100)/100;
    }

    public String lineInfo() {
        String resp = "The Two Points Are: (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ")";
        resp += "The Equation Of The Line Between The Two Points Is: " + equation() + "\n";
        resp += "The Slope Of The Equation Is: " + getSlope() + "\n";
        resp += "The y-Intercept Of The Equation Is: " + getYIntercept() + "\n";
        resp += "The Distance Between The 2 Coordinates Is: " + getDistance() + "\n";

        return resp;
    }

}
