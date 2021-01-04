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
public class Cat extends Animal {
    public Cat()
    {
        super(7);
        System.out.println("A cat has been created");
    }
    
    
    public void eat()
    {
        System.out.println("A cat is eating");
    }
    
    public void meow()
    {
        System.out.println("A cat meows");
    }
    
    public void prance()
    {
        System.out.println("A cat is prancing");
    }
}
