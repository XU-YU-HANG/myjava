public class ThreadTest1 extends Thread {

  public void run(){
    int i=0;
      while (true){
          try {
              Thread.sleep(1000);
          } catch (InterruptedException e) {
              e.printStackTrace();
          }
          System.out.println("分支线程执行了-->"+(i++));


      }

  }

}

