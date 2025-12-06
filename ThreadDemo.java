class Boys extends Thread{
    @Override
    public void run(){
        for(int i=0; i < 10; i++){
            System.out.println("what is this"+i);
            try{
                Thread.sleep(10);
            }
            catch(InterruptedException e){
                e.printStackTrace();
                
            }
        }
    }
}class Girls extends Thread{

    @Override
    public void run(){
        for(int i=0; i < 10; i++){
            System.out.println("what is this Girls"+i);
        }
    }
}

class Counter {
    int count = 0;

    public void increment() {
        count = count + 1; // Not atomic!
    }
}



public class ThreadDemo{
    public static void main(String[] args) {
         Counter counter = new Counter();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) counter.increment();
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) counter.increment();
        });
t1.start();
t2.start();
      try {
    t1.join();
    t2.join();
} catch (InterruptedException e) {
    e.printStackTrace();
}


        System.out.println("Final count: " + counter.count);
    //     Boys b=new Boys();
    //     Girls g=new Girls();
    //    b.start();
    //    g.start();  
 }


}