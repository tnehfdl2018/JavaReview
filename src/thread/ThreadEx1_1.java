package thread;

class ThreadEx1_1 extends Thread {
  @Override
  public void run() {
    for (int i = 0; i < 5; i++ ) {
      System.out.println(getName());
    }
  }
}

class ThreadEx1_2 implements Runnable {
  @Override
  public void run() {
    Thread.currentThread().setName("good");
    for (int i = 0; i < 5; i++ ) {
      System.out.println(Thread.currentThread().getName());
    }
  }
}
