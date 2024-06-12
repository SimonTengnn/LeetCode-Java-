package src.test;

/*

public class testThread implements Runnable{

    @Override
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("VIP来了 你们都别耍帅了 "+ i);
        }
    }

    public static void main(String[] args) {
        testThread tt = new testThread();
        Thread t = new Thread(tt);
        t.start();

        //主线程
        for(int i=0;i<10;i++){
            System.out.println("main "+i);

            if(i==3){
                try {
                    t.join();
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
*/
/*
interface say{
    public abstract void say();
}

public class testThread{
    public static void main(String[] args){
        say sayLove = () -> System.out.println("I Love U");
        sayLove.say();
    }
}
 */

public class testThread implements Runnable{

    boolean flag=true;
    private int ticket=10;

    @Override
    public void run(){
        while(flag){
            try {
                buy();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private synchronized void buy() throws InterruptedException{
        if(ticket>0){
            System.out.println(Thread.currentThread().getName()+" 买到了第 "+ticket--+" 张票");

        }else{
            flag=false;
        }
        Thread.sleep(100);

    }

    public static void main(String[] args) {
        testThread test = new testThread();

        Thread t1 = new Thread(test,"乘客1");
        Thread t2 = new Thread(test,"乘客2");
        Thread t3 = new Thread(test,"黄牛");

        t1.start();
        t2.start();
        t3.start();
    }
}