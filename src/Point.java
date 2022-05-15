public class Point {
    public Integer x;
    public Integer y;
    public Point(int x, int y)
    {
        this.x=x;
        this.y=y;
        System.out.println(Coords());
    }
    public String Coords()
    {
        return "("+x.toString()+";"+y.toString()+")";
    }
}