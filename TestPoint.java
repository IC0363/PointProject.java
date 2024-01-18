public class TestPoint {
    public static void main(String[]args){
        Point p1 = new Point(0,0);
        Point p2 = new Point(3,4);
        Point p3 = new Point(-5,7);
        Point p4 = new Point(3,-10);
        Point p5 = new Point(3,10);
        Point p6 = new Point(6,8);

        System.out.println("Manhattan Distance: ");
        System.out.println("Point 2 to Point 3: " + p2.manhattanDistance(p3));
        System.out.println("Point 3 to Point 4: " + p3.manhattanDistance(p4));

        System.out.println("Colinear Check: ");
        System.out.println("Point 2,4,5: " + p2.isCollinear(p4, p5));
        System.out.println("Point 2,3,4: " + p2.isCollinear(p3, p4));
        System.out.println("Point 1,2,6: " + p1.isCollinear(p2, p6));
        System.out.println("Point 1,2,3: " + p1.isCollinear(p2, p3));

    }
    
}
