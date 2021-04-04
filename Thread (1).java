public class Test {
    public static void main(String[] args) {
    Thread t=new ThreadTest1();
    t.setName("xyh");
        t.setDaemon(true);
        t.start();

        for (int i=0;i<=10;i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("main线程执行了-->"+i);

        }

    }
}
