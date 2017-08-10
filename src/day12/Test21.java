package day12;


interface Areable
{
    public double getArea();

}
class NoValueException extends RuntimeException
{
    NoValueException()
    {
        super();
    }
    NoValueException(String message)
    {
        super(message);
    }
}
class Rec implements Areable
{
    private int length;
    private int width;
    Rec(int length,int width)
    {
        if (length<=0||width<=0)
        {
//            System.out.println("数据非法");
//            return;
            throw new NoValueException("数据非法");
        }
        this.length=length;
        this.width=width;
    }

    public double getArea() {
        return length*width;
    }
}
class Circle implements Areable
{
    private int radius;
    public static final double PI=3.14;
    Circle(int radius)
    {
        if (radius<=0)
            throw new NoValueException("半径值非法");
        this.radius=radius;
    }
    public double getArea() {
        return radius*radius*PI;
    }
}
public class Test21 {
    public static void main(String[] args) {
//        Rec r=new Rec(-3,5);
//        double a=r.getArea();

        Circle c=new Circle(-2);
        double b=c.getArea();
        System.out.println("area:"+b);
    }
}
