public class Main {

    public static void main(String[] args) {
	// write your code here
        for (int i =0; i<3;i++) {
            Threading threading = new Threading(i);
            threading.start();
            //can use threads.join() stop the meaning of thread in this scenario

        }
        throw new RuntimeException();

    }
}