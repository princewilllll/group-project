import javax.swing.*;
import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double value;
        double a;
        double b;
       // System.out.println("enter the first number");
        a = in.nextDouble();
       // System.out.println("enter the second number");
        b = in.nextDouble();

        value = larger(a, b);
        IDPrint(a, b);
        Intro();


        System.out.print("the maximum value between " + a + " and " + b + " is: " + value);

    }


    public static double larger(double x, double y) {


        double max;

        if (x >= y)
            max = x;
        else
            max = y;

        return max;




    }
    public static void IDPrint(double x, double y)
    {
      //  System.out.println(" the first number is "+ x);
      //  System.out.println(" the first number is "+ y);
    }
    public static void Intro()
        {
        System.out.println("hi i am princewill");
        System.out.println(" prince for short");
        System.out.println("i love to learn new skills for my future wife and family");
    }
}