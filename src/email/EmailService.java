package email;

import java.util.concurrent.Future;

public interface EmailService {

    Future<String> sendEmail(Email email);
}
