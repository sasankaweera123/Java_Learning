
package binarytree;


public class EBST <D extends Comparable> implements Tree<D>{
    
    public EBST()
    {
        
    }
    
    public boolean isEmpty()
    {
        return true;
    }
     public int cardinality()
     {
         return 0;
     }
     public boolean member(D Element)
     {
         return false;
     }
     
     public NEBST<D> add(D Element)
     {
        return new NEBST<D>(Element);
     }
}
