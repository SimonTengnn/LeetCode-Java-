package src.multiThread;

public class myThread extends Thread{
    @Override
    public void run(){
        for(int i=0; i<20; i++){
            System.out.println("这里是thread "+i);
        }
    }

    public static void main(String[] args) {
        myThread mt = new myThread();
        mt.start();

    }
}


