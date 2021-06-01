package HomeworkDay5.eCommerce.core;

import HomeworkDay5.eCommerce.core.AuthService;
import HomeworkDay5.eCommerce.googleAuth.GoogleAuthManager;

public class GoogleAuthManagerAdapter implements AuthService {

    @Override
    public void login(String email, String password) {
        GoogleAuthManager manager = new GoogleAuthManager();
        manager.login(email,password);
    }

    @Override
    public void register(int id, String firstName, String lastName, String eMail, String password) {
        GoogleAuthManager manager = new GoogleAuthManager();
        manager.register(eMail,password);
    }
}
