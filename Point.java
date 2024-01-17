public class Point{

    private int x;
    private int y;

    public Point(int MyX, int MyY){
        x = MyX;
        y = MyY;


    }
    public int manhattanDistance(Point other){
        int xDist = Math.abs(x) - Math.abs(other.getX());
        int yDist = Math.abs(y) - Math.abs(other.getY());

        return xDist + yDist;

    }

    public boolean isCollinear(Point p1, Point p2){
            


    }

}