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
public abstract class Animal {
    private int age;
    
    public Animal(int age)
    {
        this.age = age;
        System.out.println("An animal has been created");
    }
    public abstract void eat();
    
    public void sleep()
    {
        System.out.println("An Animal is sleeping");
    }
    
    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
    
}
