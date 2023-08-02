public class PrintRunnable implements Runnable{

    private int i;

    public PrintRunnable(int i) {
        this.i = i;
    }

    @Override
    public void run() {
        System.out.println(i);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
