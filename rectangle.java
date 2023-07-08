import java.util.*;

class Test

{

    public static void main(String[] args)

    {

        Rectangle t = new Rectangle(10 , 20);

        System.out.println("area: "+t.area());

        System.out.print("perimeter: "+ t.perimeter());

    }

}

class Rectangle

{

    int l,b;

    public Rectangle(int length,int breadth)
    {
        l=length;
        b=breadth;
    }

    public float area()
    {
        return (float)(l*b);
    }

    public float perimeter()
    {
        return l+b;
    }

}

 
