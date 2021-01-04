/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionaries;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author DELL
 */
public class Eng_to_pattern {
    
    Map<Integer,String> Pattern = new HashMap<Integer,String>();
    
    public  Eng_to_pattern()
    {
        Pattern.put(1, "*");
        Pattern.put(2, "**");
        Pattern.put(3, "***");
        Pattern.put(4, "****");
        Pattern.put(5, "*****");
    }
    
    public void Display()
    {
        System.out.println(Pattern.get(1));
        System.out.println(Pattern.get(2));
        System.out.println(Pattern.get(3));
        System.out.println(Pattern.get(4));
        System.out.println(Pattern.get(5));  
        
        System.out.println(Pattern.size());
        
        System.out.println(Pattern.values());
        
        System.out.println(this.Pattern.keySet());
    }
    public void remove(int n)
    {
        this.Pattern.remove(n); 
    }
    
    public void replace(int n)
    {
        this.Pattern.replace(n, "********");
    }
}
