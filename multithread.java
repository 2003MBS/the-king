import java.util.*;
class odd extends Thread
{
    private int num1=0;
    public void run()
    {
        for(int i=0;i<=num1;i++)
        {
            if(num1%2==0)
            {
                System.out.print(num1+" ");
            }
            num1=num1+1;
        }
    }
}
class even extends Thread
{
    private int num2=0;
    public void run()
    {
        for(int i=0;i<=num2;i++)
        {
            if(num1%2==0)
            {
                System.out.print(num2+" ");
            }
            num2=num2+1;
        }
    }
}
class test
{
    public static void main(String args[])
    {
        odd o = new odd();
        even e = new even();
        try
        {
            System.out.println("Odd numbers");
            o.start();
            o.join();
        }
        catch(Exception e)
        {
            System.out.println("exception occured");
        }
        System.out.println("\nEven nunbers");
        e.start();
    }
