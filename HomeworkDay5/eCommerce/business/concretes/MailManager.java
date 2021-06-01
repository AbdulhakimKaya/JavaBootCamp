package HomeworkDay5.eCommerce.business.concretes;

import HomeworkDay5.eCommerce.business.abstracts.MailService;

public class MailManager implements MailService {
    @Override
    public void sendMail(String message) {
        System.out.println("Doğrulama maili gönderilmiştir" + message);
    }
}
