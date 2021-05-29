package HomeworkDay5.eCommerce.business.abstracts;

import HomeworkDay5.eCommerce.entities.concretes.User;

import java.util.List;

public interface UserService {
    void add(User user);
    void update(User user);
    void delete(User user);
    List<User> getAllUsers();
    User get(int id);
    List<String> getAllMails();
    boolean ifMailExist(User user);
    boolean ifPasswordExist(User user);
}
