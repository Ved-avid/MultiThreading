class AnotherThread extends Thread{
    public void run(){
        System.out.println("Hello from Another Thread");
    }
}

class Main{
    static public void main(String[] args){
        System.out.println("Hello from Main Thread");
        
        Thread t = new AnotherThread();
        t.start();
        
        System.out.println("Hello again from main thread");
        
        new Thread(){
            public void run(){
                System.out.println("Hello from new Thread");
            }
        }.start();
    }
}