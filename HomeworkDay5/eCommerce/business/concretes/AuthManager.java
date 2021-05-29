package HomeworkDay5.eCommerce.business.concretes;

import HomeworkDay5.eCommerce.business.abstracts.AuthService;
import HomeworkDay5.eCommerce.business.abstracts.UserService;
import HomeworkDay5.eCommerce.entities.concretes.User;

public class AuthManager implements AuthService {

    private UserService userService;

    public AuthManager(UserService userService) {
        this.userService = userService;
    }

    @Override
    public void signIn(User user) {

    }

    @Override
    public void signUp(User user) {

    }

    @Override
    public void signInWithGoogle(User user) {

    }

    @Override
    public void getVerifyState(User user, String kod) {

    }
}
