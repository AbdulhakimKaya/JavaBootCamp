package HomeworkDay5.eCommerce.dataAccess.abstracts;

import HomeworkDay5.eCommerce.entities.concretes.User;

import java.util.List;

public interface UserDao {
    void add(User user);

    void update(User user);

    void delete(User user);

    User get(int id);

    List<User> getAll();
}
