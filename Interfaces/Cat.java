
package interfaces;


public class Cat implements Animal {
    private String A =  "Micky";
    
    public void eat()
    {
        System.out.println("Cat is Eating");
        
    }
    public String Name()
    {
        return this.A;
    }
    public void sleep()
    {
        System.out.println("Cat is Sleeping");
    }
    
    public void travel()
    {
        System.out.println("Cat is Running");
    }
    public void Attack()
    {
        System.out.println("Cat is Attacking");
    }
    
    public void Speak()
    {
        System.out.println("Meow");
    }
}
