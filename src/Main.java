import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Point> hs = new HashSet<Point>();
        hs.add(new Point(0,0));
        hs.add(new Point(0,6));
        hs.add(new Point(7,0));
        Point[] points = new Point[hs.size()];
        hs.toArray(points);
        checkTriangle(getSide(points[0], points[1]), getSide(points[1], points[2]), getSide(points[2], points[0]));
    }
    static void checkTriangle(double x, double y, double z)
    {
            if (x == y && y == z )
                System.out.println("Рівносторонній трикутник");
            else if (x == y || y == z || z == x )
                System.out.println("Рівнобедрений трикутник");
            else if (x != y || y!= z || z != x)
                System.out.println("Нерівносторонній трикутник");
    }
    static double getSide(Point p1, Point p2){
        return Math.sqrt(
                (p1.x - p2.x) *  (p1.x - p2.x) +
                        (p1.y - p2.y) *  (p1.y - p2.y)
        );
    }
}