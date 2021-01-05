
package interfaces;

import java.util.Random;

public class Interfaces {

    //This is Used to get the random summon
    public static Animal summon()
    {
        Random rand = new Random();
        if(Math.abs(rand.nextInt())%2 == 0)
        {
            if(Math.abs(rand.nextInt())%2 == 0)
            {
                return new Dog();
            }
            else
            {
                return new Cat();
            }
        }
        else
        {
            return new Bird();
        }
    }
    
    public static void main(String[] args) {
      
        
        Dog d = new Dog();
        Cat c = new Cat();
        Bird b = new Bird();

        System.out.println("Neme : "+d.Name());
        d.sleep();
        d.eat();
        System.out.println("Name : "+b.Name());
        b.Attack();
        System.out.println("Name : "+c.Name());
        c.travel();
        c.Speak();
        
        System.out.println("");
        System.out.println("");
        System.out.println("");
        
        
        //Using smmon method we create get a random animals
        //Using summon method we can use interface methods only
        Animal a1 = summon();
        Animal a2 = summon();
        System.out.println("Name : "+a1.Name());
        a1.Attack();
        System.out.println("Name : "+a2.Name());
        a2.travel();
        a1.eat();
    }
    
}
