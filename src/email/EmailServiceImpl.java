package email;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class EmailServiceImpl implements EmailService {

    private ExecutorService es = Executors.newFixedThreadPool(3);

    @Override
    public Future<String> sendEmail(Email email) {
        return es.submit(new EmailSender(email));
    }
}
