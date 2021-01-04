
package queues_and_stacks;

import java.util.LinkedList;


public class Queuey {
    LinkedList Q;
    
    public Queuey()
    {
         this.Q = new LinkedList();
    }
    
    public boolean IsEmpty()
    {
        return Q.isEmpty();
    }
    
    public int size()
    {
        return Q.size();
    }
    
    public void EnQueue(int n)
    {
        Q.addLast(n);
    }
    
    public int Dequeue()
    {
        return (int)Q.remove(0);
    }
    
    public int peek()
    {
        return (int)Q.get(0);
    }
}
