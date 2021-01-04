/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstract_classes;

/**
 *
 * @author DELL
 */
public class Dog extends Animal{
    
    public Dog() {
        super(15);
        System.out.println("A dog has been created");
    }
    
    public void eat()
    {
        System.out.println("A dog is eating"); 
    }
    
    @Override
    public void sleep()
    {
        System.out.println("A Dog is sleeping");
    }
    
    public void ruff()
    {
        System.out.println("The Dog says Ruff");
    }
    
    public void run()
    {
        System.out.println("A dog is running");
    }
    
}
