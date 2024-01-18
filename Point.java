public class Point{

    private int x;
    private int y;

    public Point(int MyX, int MyY){
        x = MyX;
        y = MyY;


    }
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int manhattanDistance(Point other){
        int xDist = Math.abs(x - other.getX());
        int yDist = Math.abs(y - other.getY());
    
        return xDist + yDist;
    }
    

    public boolean isCollinear(Point p1, Point p2){

        double slope1 = (double)(y - p1.getY()) / (x - p1.getX());
        double slope2 = (double)(y - p2.getY()) / (x - p2.getX());
       
        return Math.abs(slope1 - slope2) <.01;

            


    }

}