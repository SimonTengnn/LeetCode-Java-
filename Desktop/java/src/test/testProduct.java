package src.test;
// 管程法: 共享一个缓冲区
public class testProduct {
    public static void main(String[] args) {
        pool pool= new pool();

        Producer producer = new Producer(pool);
        Consumer consumer = new Consumer(pool);

        Thread t_producer = new Thread(producer);
        Thread t_consumer = new Thread(consumer);
        t_consumer.start();
        t_producer.start();

    }

}

class Producer implements Runnable{
    pool pool;
    public Producer(pool pool){
        this.pool=pool;
    }
    @Override
    public void run(){
        for (int i = 0; i < 100; i++) {
            Product newproduct = new Product(i);
            pool.push(newproduct);
            System.out.println("生产了--->"+i+" 个产品");
        }
    }
}
class Consumer implements Runnable{
    pool pool;
    public Consumer(pool pool){
        this.pool=pool;
    }
    @Override
    public void run(){
        for (int i = 0; i < 100; i++) {
            pool.pop();
            System.out.println("消费了--->"+pool.pop().id+" 个产品");
        }
    }
}

class Product{
    public int id;
    public Product(int id){
        this.id = id;
    }
}

class pool {
    // 缓冲池
    Product[] products = new Product[10];
   static int count = 0;

    public synchronized void push(Product p) { // 同步方法
        // 缓冲池已满，生产者循环等待
        while (count >= products.length) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        // 未满，往里放
        products[count] = p;
        count++;
        this.notifyAll();
    }

    public synchronized Product pop() {
        Product p = null;
        // 缓冲池为空，消费者循环等待
        while (count <= 0) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        // 不为空，可以消费
        count--;
        p = products[count];
        this.notifyAll();
        return p;
    }
}