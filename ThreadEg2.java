/** Example 2 : Thread in java by implementing Runnable Interface */
 import java.lang.Thread;
public class ThreadEg2 implements Runnable {
  public static void main(String[] args) {
    ThreadEg2 obj = new ThreadEg2();
    Thread thread = new Thread(obj);
    thread.start();
    System.out.println("This code is outside of the thread");
  }
  public void run() {
    System.out.println("This code is running in a thread");
  }
}