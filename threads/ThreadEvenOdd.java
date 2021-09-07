package threads;

public class ThreadEvenOdd{

    int i = 1;
    public static void main(String[] args) {

        ThreadEvenOdd t = new ThreadEvenOdd();
        Thread t1 = new Thread(t::printOdd);
        Thread t2 = new Thread(t::printEven);
        t2.setDaemon(true); 
        t1.start();
        t2.start();


    }

    public void printEven() {

        synchronized (this) {
            while(i < 10) {
                if(i % 2 != 0) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                    System.out.print(i + " ");
                    i++;
                    notify();
            }

        }
    }

    public void printOdd() {

        synchronized (this) {
            while( i < 10) {
                if (i % 2 == 0) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                    System.out.print(i +" ");
                    i++;
                    notify();
                }
        }
    }
}






