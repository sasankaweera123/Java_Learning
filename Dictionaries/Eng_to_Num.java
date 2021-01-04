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
public class Eng_to_Num {
        //English with Number Dictionaries
     Map<String,Integer> engNum = new HashMap<String,Integer>();
    public Eng_to_Num()
    {
        //Entering Values 
        engNum.put("One", 1);
        engNum.put("Two", 2);
        engNum.put("Three", 3);
        engNum.put("Four", 4);
        engNum.put("Five", 5);
    }
    public void display()
    {
        //Retriving Output(Data)
        System.out.println(engNum.get("One"));
        System.out.println(engNum.get("Two"));
        System.out.println(engNum.get("Three"));
        System.out.println(engNum.get("Four"));
        //get the all main Words (Key set)
        System.out.println(engNum.keySet());
        //get all values
        System.out.println(engNum.values());
        //get the size of Dictionarie
        System.out.println(engNum.size());
    }
        
        
}

