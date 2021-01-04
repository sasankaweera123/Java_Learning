
package queues_and_stacks;

import java.util.Stack;


public class Queues_and_Stacks {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Queuey q = new Queuey();
        q.EnQueue(2);
        q.EnQueue(4);
        q.EnQueue(9);
        System.out.println("Peek = "+ q.peek());
        System.out.println("Size = "+ q.size());
        System.out.println("Dequeue :"+ q.Dequeue());
        System.out.println("size now = " + q.size());
        System.out.println("Peek = "+ q.peek());
        
        
        System.out.println("");
        System.out.println("");
        
        
        
        
        Stack<String> s = new Stack();
        System.out.println(s.isEmpty());
        System.out.println("Size = "+ s.size());
        s.push("Sasa");
        s.push("Weera");
        s.push("Java");
        s.push("Life");
        System.out.println("Size = "+ s.size());
        System.out.println(s.isEmpty());
        System.out.println(s);
        System.out.println(s.remove("Weera"));
        System.out.println("Size = "+ s.size());
        System.out.println(s);
        System.out.println(s.pop());
       
    }
    
}
