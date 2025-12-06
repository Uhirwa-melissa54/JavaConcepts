import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class CallableTask implements Callable<Integer>{
    int value;
    CallableTask(int value){
        this.value=value;
    }
    @Override
    public Integer call() throws Exception{
        return value;
    }

}
public class CallableTaskMain{
    public static void main(String[] args){
        try{
        ExecutorService executorService=Executors.newFixedThreadPool(2);
        Future<Integer> f=executorService.submit(new CallableTask(5));
        Future<Integer> f2=executorService.submit(new CallableTask(78));

        System.out.println("1."+f.get());
        System.out.println("2."+f2.get());
        executorService.shutdown();
        }
        catch(Exception e){
            e.printStackTrace();
        }


    }
}