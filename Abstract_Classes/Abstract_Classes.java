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
public class Abstract_Classes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cat c= new Cat();
        Dog d= new Dog();
        c.eat();
        d.eat();
        c.sleep();
        d.sleep();
        
        Object D = new Dog();
        Dog rD = (Dog) D;
        rD.run();
        
        Cat rc = new Cat();
        if(rc instanceof Animal)
        {
            Animal A = (Animal) rc;
            A.eat();
        }
        rc.eat();
    }
    
}
