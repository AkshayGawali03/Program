
class Base
{
    public int A,B;
    public Base()
    {
        System.out.println("Base constructor");
    }
    public void fun()
    {
      System.out.println("Base fun");

    }
}

class Derived extends Base
{
    public int X,Y;
    public Derived()
    {
        System.out.println("Derived constructor");

    }
    public void gun()
    {
      System.out.println("Derived gun");

    }
}

class DerivedX extends Derived
{
    public int P,Q;
    public DerivedX()
    {
        System.out.println("DerivedX constructor");
    }
}

class multilevel
{
    public static void main(String arg[])
    {
        Derived dobj = new DerivedX();
        dobj.fun();
        dobj.gun();

        
    }
}