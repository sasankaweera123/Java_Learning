
package recurision;

import java.util.Scanner;


public class Recurision {

    public static int MultiOfNum(int n)
    {
        if(n<=0)
        {
            return 1;
        }
        else
        {
            return n*MultiOfNum(n-1);
        }
    }
    public static int SumOfNum(int n)
    {
        if(n<=0)
        {
            return 0;
        }
        else
        {
            return n+SumOfNum(n-1);
        }
    }

    public static int exponentiation(int n , int b)
    {
        if(b<=0)
        {
            return 1;
        }
        else
        {
            return n*exponentiation(n,b-1);
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Enter Your Number :");
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        System.out.println("Multiplication of your Number until 0 : "+MultiOfNum(x));
        System.out.println("Summation of your number until 0 : "+SumOfNum(x));
        System.out.println("Value : "+exponentiation(x,4));
    }

}
