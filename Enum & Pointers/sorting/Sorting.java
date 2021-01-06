
package sorting;

import static sorting.Colour.*;


public class Sorting {

    
    public static void main(String[] args) {
        // TODO code application logic here
        
        //This is like Pointers when we hange One of data Others date also Change 
        Car Toyota = new Car();
        Car Toyota_Prius = Toyota;
        
        System.out.println("Colour of the Car : "+ Toyota.getColour());
        System.out.println("Colour of the Car : "+ Toyota_Prius.getColour());
        
        Toyota.setColour(BLUE);
        System.out.println("Colour of the Car : "+ Toyota.getColour());
        System.out.println("Colour of the Car : "+ Toyota_Prius.getColour());
        
        Toyota_Prius.setColour(RED);
        System.out.println("Colour of the Car : "+ Toyota.getColour());
        System.out.println("Colour of the Car : "+ Toyota_Prius.getColour());
        
    }
    
}
