
package binary_number;

import java.util.ArrayList;


public class Binary_Number {

    public static void Binary(int n)
    {
        ArrayList<Integer> r = new ArrayList<Integer>();
       
        while(n>0)
        {
            r.add(n%2);
            n=n/2;
            
        }
        for(int j= 0; j<r.size(); j++)
        {
            System.out.print(r.get(r.size()-j-1));
        }
        System.out.println("");
    }
    
    public static void Decimal(long n)
    {
        
        int sum=0;
        int i =0;
        while(n>0)
        {
           sum = (int) (sum + ((n%10)*Math.pow(2, i)));
           i++;
           n=n/10;
        }
        System.out.println(sum);
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Binary(10);
        Decimal(11100011);
    }
    
}
