//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        MyThread myThread = new MyThread(1);
        MyThread myThread2 = new MyThread(2);
        MyThread myThread3 = new MyThread(3);
        myThread.start();
        myThread2.start();
        myThread3.start();

    }

}
 class MyThread extends Thread {
     @Override
     public void run() {
         process(threadNo);
     }
     int threadNo = 0;

     public int getThreadNo() {
         return threadNo;
     }

     public MyThread(int threadNo) {
         this.threadNo = threadNo;
     }

     public static int process(int numb) {
         for(int i = 1; i <= 10; i++){
             System.out.println("Thread No : "+numb+" line : "+i);
         }
         //System.out.println("Thread No : "+);
         return numb;
     }
 }
