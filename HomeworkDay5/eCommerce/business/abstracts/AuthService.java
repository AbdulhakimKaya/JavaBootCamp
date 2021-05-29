package HomeworkDay5.eCommerce.business.abstracts;

import HomeworkDay5.eCommerce.entities.concretes.User;

public interface AuthService {
    void signIn(User user);
    void signUp(User user);
    void signInWithGoogle(User user);
    void getVerifyState(User user, String kod);

}
