package src.test;

import java.util.concurrent.locks.ReentrantLock;

/*
import java.util.concurrent.locks.ReentrantLock;

public class testLock implements Runnable{
    private final ReentrantLock myLock = new ReentrantLock();       //显式锁
    boolean flag=true;
    private int ticket=10;

    @Override
    public void run(){
        while(flag){

            try {
                myLock.lock();  // 加锁

                buy();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                myLock.unlock();    // 解锁
            }
        }
    }

    private void buy() throws InterruptedException{
        if(ticket>0){
            System.out.println(Thread.currentThread().getName()+" 买到了第 "+ticket--+" 张票");

        }else{
            flag=false;
        }
        Thread.sleep(100);

    }

    public static void main(String[] args) {
        src.test.testThread test = new src.test.testThread();

        Thread t1 = new Thread(test,"乘客11");
        Thread t2 = new Thread(test,"乘客22");
        Thread t3 = new Thread(test,"黄牛111");

        t1.start();
        t2.start();
        t3.start();
    }
}
*/
public class testLock {
    private static ReentrantLock lock = new ReentrantLock();    // 可重入锁
    // Object lock = new Object();  普通对象锁
    private static volatile int count = 0;      // volatile保证变量在多个线程之间的可见性

    public static void main(String[] args) {
        Thread threadA = new Thread(() -> {
            while (count < 100) {
                synchronized (lock) {
                    if (count % 2 == 0) {
                        System.out.print("A");
                        count++;
                    }
                }
            }
        });

        Thread threadB = new Thread(() -> {
            while (count < 100) {
                synchronized (lock) {
                    if (count % 2 == 1) {
                        System.out.print("B");
                        count++;
                    }
                }
            }
        });

        threadA.start();
        threadB.start();
    }
}

