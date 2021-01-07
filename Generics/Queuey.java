/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generics;

/**
 *
 * @author DELL
 */


import java.util.LinkedList;


public class Queuey<T> {
    LinkedList<T> Q;
    
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
    
    public void EnQueue(T n)
    {
        Q.addLast(n);
    }
    
    public T Dequeue()
    {
        return Q.remove(0);
    }
    
    public T peek()
    {
        return Q.get(0);
    }
    
    @Override
    public String toString()
    {
        for(int i = 0; i<Q.size()-1; i++)
        {
            return Q.get(i) + " ";
        }
        return Q.get(Q.size()) + " ";
    }
}

