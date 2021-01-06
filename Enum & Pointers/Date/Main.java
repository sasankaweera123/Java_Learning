/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Date;


import static Date.Week_String.*;

public class Main {
     
    public static void main(String[] args) {
        Date d = new Date();
        
        //Enum are used to Store data that are solid(Cant Change)
        //As Final Data set
        d.setW(Week_String.SATURDAY);
        System.out.println("Today is : " + d.getW());
    }
}
