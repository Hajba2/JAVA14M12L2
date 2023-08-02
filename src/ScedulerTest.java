import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScedulerTest {

    public static void main(String[] args) {
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(2);

//        scheduler.schedule(
//                () -> System.out.println("text"),
//                2,
//                TimeUnit.SECONDS
//        );

        //scheduleWithFixedDelay відлік часу для нової задаяі починається тільки після
        // того як попредня задача завершила виконання

        //scheduleAtFixedRate відлік часу починається як тільки попередня задача почала виконання
        scheduler.scheduleAtFixedRate(
                () -> {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println("text " + System.currentTimeMillis());
                },
                0,
                1,
                TimeUnit.SECONDS
        );
    }
}
