
package interfaces;


public class Dog implements Animal {
    
    private String A =  "Tess";
    
    public void eat()
    {
        System.out.println("Dog is Eating");
        
    }
    public String Name()
    {
        return this.A;
    }
    public void sleep()
    {
        System.out.println("Dog is Sleeping");
    }
    
    public void travel()
    {
        System.out.println("Dog is Running");
    }
    public void Attack()
    {
        System.out.println("Dog is Attacking");
    }
    
}
