package fizzbuzz;

import java.util.ArrayList;
import java.util.List;

public class NumberProcessorTest {
    public static void main(String[] args) {
        NumberProcessor npFizz = new NumberProcessor((n) -> {
            if (n % 3 == 0) {
                System.out.println("FIZZ");
            }
        });

        NumberProcessor npBazz = new NumberProcessor((n) -> {
            if (n % 5 == 0) {
                System.out.println("Bazz");
            }
        });

        NumberProcessor npFizzBAzz = new NumberProcessor((n) -> {
            if (n % 5 == 0 && n % 3 == 0) {
                System.out.println("Fizz Bazz");
            }
        });

        NumberProcessor npNotFizzBAzz = new NumberProcessor((n) -> {
            if (n % 5 != 0 && n % 3 != 0) {
                System.out.println(n);
            }
        });

        List<NumberProcessor> threads = new ArrayList<>();
        threads.add(npBazz);
        threads.add(npFizz);
        threads.add(npFizzBAzz);
        threads.add(npNotFizzBAzz);

        for (NumberProcessor t : threads) {
            t.start();
        }

        for (int i = 0; i < 100; i++) {
            for (NumberProcessor t : threads) {
                t.process(i);
            }

            while (true) {
                int processed = 0;
                for (NumberProcessor t : threads) {
                    if (t.isNProcessed()) {
                        processed++;
                    }
                }
                if (processed == 4) {
                    break;
                }
            }
        }
    }
}
