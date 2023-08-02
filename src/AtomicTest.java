import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class AtomicTest {

    private volatile static int counter = 0;

    private volatile static AtomicInteger atomicCounter = new AtomicInteger(0);

    public static void main(String[] args) throws InterruptedException {

        List<Thread> list = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            Thread t = new Thread(() -> {
                for (int j = 0; j < 100; j++) {
                    atomicCounter.addAndGet(j);
                }
            });
            list.add(t);
        }

        for (Thread t : list) {
            t.start();
        }

        for (Thread t : list) {
            t.join();
        }

        System.out.println(atomicCounter);

    }
}
