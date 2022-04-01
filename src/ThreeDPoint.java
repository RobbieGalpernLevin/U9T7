public class ThreeDPoint extends Point
{
    private int z;

    public ThreeDPoint(String label, int x, int y, int z)
    {
        super(label, x, y);
        this.z = z;
    }

    @Override
    public String toString()
    {
        return super.toString() + ", z = " + z;
    }

    @Override
    public boolean equals(Object object)
    {
        if (super.equals(object) && object instanceof ThreeDPoint)
        {
            ThreeDPoint p1 = (ThreeDPoint) object;
            if(this.z == p1.z)
            {
                return true;
            }
        }
        return false;
    }
}
