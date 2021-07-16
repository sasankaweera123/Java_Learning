
package binarytree;


class NEBST<D extends Comparable> implements Tree<D>{
    private D data;
    private Tree left;
    private Tree right;
    
    public NEBST(D Element)
    {
        this.data = Element;
        this.left = new EBST<D>();
        this.right = new EBST<D>();
    }
    
    public NEBST(D Element,Tree<D> left,Tree<D> right)
    {
        this.data = Element;
        this.left = left;
        this.right = right;
    }
    
    public boolean isEmpty()
    {
        return false;
    }
    
    public int cardinality()
    {
        return 1+this.left.cardinality() + this.right.cardinality();
    }
    
    public boolean member(D Element)
    {
        if(this.data == Element)
        {
            return true;
        }
        else
        {
            if(Element.compareTo(this.data)<0)
            {
                return this.left.member(Element);
            }
            else
            {
                return this.right.member(Element);
            }
        }
    }
    
    public NEBST<D> add(D Element)
    {
        if(this.data==Element)
        {
            return this;
        }
        else
        {
            if(Element.compareTo(this.data)<0)
            {
                return new NEBST(this.data,this.left.add(Element),this.right);
            }
            else
            {
                return new NEBST(this.data,this.left,this.right.add(Element));
            }
        }
    }
    
    public String toString()
    {
        return this.data + " " + this.left +" "+ this.right;
    }
    
}
