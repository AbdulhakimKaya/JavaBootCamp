package HomeworkDay5.eCommerce.dataAccess.concretes;

import HomeworkDay5.eCommerce.dataAccess.abstracts.UserDao;
import HomeworkDay5.eCommerce.entities.concretes.User;

import java.util.List;

public class HibernateUserDao implements UserDao {
    @Override
    public void register(User user) {

    }

    @Override
    public void login(User user) {

    }

    @Override
    public void update(User user) {

    }

    @Override
    public User get(int id) {
        return null;
    }

    @Override
    public List<User> getAll() {
        return null;
    }
}
