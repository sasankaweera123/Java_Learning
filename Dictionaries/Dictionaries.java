/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionaries;



/**
 *
 * @author DELL
 */
public class Dictionaries {

    
    public static void main(String[] args) {
        Eng_to_Num E = new Eng_to_Num();
        E.display();
        
        System.out.println("");
        System.out.println("");
        System.out.println("");
        
        Eng_to_pattern p = new Eng_to_pattern();
        p.Display();
        p.remove(4);
        p.replace(2);
        p.Display();
        
    }
    
}
