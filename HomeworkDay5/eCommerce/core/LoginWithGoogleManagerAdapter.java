package HomeworkDay5.eCommerce.core;

import HomeworkDay5.eCommerce.loginWithGoogle.LoginWithGoogleManager;

public class LoginWithGoogleManagerAdapter implements LoginService{
    @Override
    public void loginToSystem(String message) {
        LoginWithGoogleManager manager = new LoginWithGoogleManager();
        manager.loginWithGoogle(message);
    }
}
