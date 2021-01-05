
package interfaces;


public class Bird implements Animal {
    private String A =  "Kiri";
    
    public void eat()
    {
        System.out.println("Bird is Eating");
        
    }
    public String Name()
    {
        return this.A;
    }
    public void sleep()
    {
        System.out.println("Bird is Sleeping");
    }
    
    public void travel()
    {
        System.out.println("Bird is Flying");
    }
    public void Attack()
    {
        System.out.println("Bird is Attacking");
    }
    
    
}
