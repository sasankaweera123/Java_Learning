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
public class Node<D> {
    Node<D> next;
    D data;
    
    public Node(D data)
    {
        this.data = data;
        this.next= null;
    }
    
    public Node(Node<D> next, D data)
    {
        this.next = next;
        this.data = data;
    }

    public D getData() {
        return data;
    }

    public void setData(D data) {
        this.data = data;
    }

    public Node<D> getNext() {
        return next;
    }

    public void setNext(Node<D> next) {
        this.next = next;
    }
    
}
