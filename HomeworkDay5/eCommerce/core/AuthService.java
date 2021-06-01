package HomeworkDay5.eCommerce.core;

public interface AuthService {
    void login(String email,String password);
    void register(int id, String firstName, String lastName, String eMail, String password);
}
