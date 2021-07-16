
package binarytree;


public interface Tree<D extends Comparable> {
    public boolean isEmpty();
    public int cardinality();//Size of the tree
    public boolean member(D Element);
    public NEBST <D> add(D Element);
    
}
