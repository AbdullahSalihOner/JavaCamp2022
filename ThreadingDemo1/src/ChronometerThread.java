public class ChronometerThread implements   Runnable{

    private Thread thread;
    private String threadName;

    public ChronometerThread(String threadName){
        this.threadName = threadName;
        System.out.println(" Creating : " + threadName);
    }

    @Override
    public void run(){
        System.out.println(" Starting : " +threadName);
        try {
            for (int i=1;i<=10;i++){
                System.out.println(threadName+" : "+i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException exception){
            System.out.println("Stopped "+threadName);
        }
        System.out.println("Thread finish : "+threadName);
    }



    public void start(){
        System.out.println("Thread object creating...");
        if (thread==null){
            thread= new Thread(this,threadName);
            thread.start();
        }
    }
}
