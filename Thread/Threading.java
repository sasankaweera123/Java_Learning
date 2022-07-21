// Can use runnable also
// in runnable we can are not limited to one class can implement more interface and also can extend classes
public class Threading extends Thread{

    private int number;
    public  Threading(int number){
        this.number=number;
    }
    @Override
    public void run() {
        for(int i =0; i<10; i++) {
            System.out.println(i + "thread Number " + number);
//            if (number == 1)
//                throw new RuntimeException();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }
}
