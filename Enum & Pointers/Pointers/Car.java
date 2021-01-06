
package pointers;

import static pointers.Colour.*;


public class Car {
    Colour colour = BLACK;

    public Car()
    {

    }


    public void setColour(Colour colour) {
        this.colour = colour;
    }

    public Colour getColour() {
        return colour;
    }

}
