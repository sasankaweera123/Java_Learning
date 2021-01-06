/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Date;

import static Date.Week_String.*;

/**
 *
 * @author DELL
 */
public class Date {
    Week_String W = MONDAY;
    
    public Date()
    {
        
    }

    public void setW(Week_String W) {
        this.W = W;
    }

    public Week_String getW() {
        return W;
    }
    
}
