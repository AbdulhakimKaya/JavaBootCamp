package HomeworkDay5.eCommerce.business.abstracts;

import HomeworkDay5.eCommerce.entities.concretes.User;

import java.util.List;

public interface UserService {

    void add(User user);
    void update(User user);
    void delete(User user);

    User get(int id);
    List<String> getAllMails(); // Mevcut tüm mailleri dön
    boolean isMailExist(User user);
    boolean isPasswordExist(User user);
    boolean isValid(User user);
}