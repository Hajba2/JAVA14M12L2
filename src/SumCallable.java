import java.util.concurrent.Callable;

public class SumCallable implements Callable<Long> {

    int a, b;

    public SumCallable(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public Long call() throws Exception {
        Thread.sleep(1000);
        return (long) a + b;
    }
}
