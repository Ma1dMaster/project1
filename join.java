public class join implements Runnable {
    public void run(){
        for (int i = 0;i < 100;i++){
            System.out.println("线程vip来了"+i);
        }
    }
    public static void main(String[] args) throws InterruptedException{
        
        join testjoin = new join();
        Thread thread = new Thread(testjoin);
        thread.start();
        //主线程
        for(int i = 0; i <500; i++){
            if(i==200){
                thread.join();//插队
            }
            System.out.println("main"+i);
        }
    }
    
}
