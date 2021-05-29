package HomeworkDay5.eCommerce.dataAccess.concretes;

import HomeworkDay5.eCommerce.dataAccess.abstracts.UserDao;
import HomeworkDay5.eCommerce.entities.concretes.User;

import java.util.ArrayList;
import java.util.List;

public class MemoryUserDao implements UserDao {

    private final Object User;
    private List<User> users;

    public MemoryUserDao(Object user) {
        User = user;
        this.users = new ArrayList<User>();
    }

    @Override
    public void add(User user) {

    }

    @Override
    public void update(User user) {

    }

    @Override
    public void delete(User user) {

    }

    @Override
    public List<User> getAllUsers() {
        return null;
    }

    @Override
    public User get(int id) {
        return null;
    }

    @Override
    public List<String> getAllMails() {
        return null;
    }

    @Override
    public boolean ifMailMatched(User user) {
        return false;
    }

    @Override
    public boolean ifPasswordMatched(User user) {
        return false;
    }
}
