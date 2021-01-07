
package generics;




public class Generics {

    public static <s extends Comparable <s>> void findmax(s x,s y)
    {
        int n = x.compareTo(y);
        if(n <0)
        {
            System.out.println(y);
        }
        else
        {
            System.out.println(x);
        }
    }
    
    public static <s> void add(s a,s b)
    {
        System.out.println((s)(Integer)((Integer)a+(Integer)b));
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
        
        findmax(100,250);
        findmax("Sasa","Weera");
        add(50,20);
        
        Node n = new Node(500);
        Node n2 = new Node("Sasa");
        System.out.println(n.getData());
        System.out.println(n2.getData());
        
        Queuey Q1 = new Queuey();
        Queuey Q2 = new Queuey();
        Queuey Q3 = new Queuey();
        Q1.EnQueue("Sasa");
        Q1.EnQueue("Weera");
        Q1.EnQueue("SASANKA");
        Q2.EnQueue(50);
        Q2.EnQueue(10);
        Q2.EnQueue(450);
        Q3.EnQueue('A');
        Q3.EnQueue('B');
        Q3.EnQueue('C');
        System.out.println(Q1.size());
        System.out.println(Q3.peek());
        System.out.println(Q2.peek());
                
        
        
        
        
    }
    
}
