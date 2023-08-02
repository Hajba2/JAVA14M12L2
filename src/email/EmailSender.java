package email;

import java.util.concurrent.Callable;

public class EmailSender implements Callable {

    private Email email;

    public EmailSender(Email email) {
        this.email = email;
    }

    @Override
    public Object call() throws Exception {
        Thread.sleep(1000);
        System.out.println(email.getText());
        return email.getText();
    }
}
