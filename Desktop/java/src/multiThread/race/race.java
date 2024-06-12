package src.multiThread.race;

public class race implements  Runnable{
    private boolean flag = false;
    @Override
    public void run(){
        for(int i=0;i<=10;i++){
            System.out.println(Thread.currentThread().getName()+"-->走了 "+i +" 步");
            if(Thread.currentThread().getName()=="兔子"&& i==9){
                try {
                    Thread.sleep(1000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        }
       if(!flag) {
           System.out.println("winner is: "+Thread.currentThread().getName());
           flag = true;
       }
    }

    public static void main(String[] args) {
        race mr = new race();           // 1. 先初始化runnable
        Thread t1 = new Thread(mr,"乌龟");       // 2. 将runnable对象放入Thread构造函数，构造Thread对象
        Thread t2 = new Thread(mr,"兔子");

        t1.start();
        t2.start();
    }
}
