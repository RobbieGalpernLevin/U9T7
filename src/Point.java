public class Point
{
    private String label;
    private int x;
    private int y;

    public Point(String label, int x, int y)
    {
        this.label = label;
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString()
    {
        return "Point " + label + " is at x = " + x + ", y = " + y;
    }

    @Override
    public boolean equals(Object object)
    {
        if(object instanceof Point || object == null)
        {
            Point p1 = (Point) object;
            if (p1.x == this.x && p1.y == this.y)
            {
                return true;
            }
        }
        return false;
    }


}
