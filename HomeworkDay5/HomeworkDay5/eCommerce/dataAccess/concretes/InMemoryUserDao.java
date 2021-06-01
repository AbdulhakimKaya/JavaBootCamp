package HomeworkDay5.eCommerce.dataAccess.concretes;

import HomeworkDay5.eCommerce.dataAccess.abstracts.UserDao;
import HomeworkDay5.eCommerce.entities.concretes.User;

import java.util.ArrayList;
import java.util.List;

public class InMemoryUserDao implements UserDao {

    List<User> users = new ArrayList<User>();

    @Override
    public void add(User user) {
        System.out.println("Kullanıcı başarılı bir şekilde eklenmiştir " + user.getFirstName());
        users.add(user);
    }

    @Override
    public void update(User user) {
        System.out.println("Kullanıcı başarılı bir şekilde güncellenmiştir " + user.getFirstName());
    }

    @Override
    public void delete(User user) {
        System.out.println("Kullanıcı başarılı bir şekilde silinmiştir.");
        users.removeIf(user1 -> user.getId() == user.getId());
    }

    @Override
    public User get(int id) {
        for (User user : users) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }

    @Override
    public List<User> getAll() {
        System.out.println("Database'deki bütün kullanıcılar listelenmiştir.");
        for (User user : users) {
            System.out.println(user.getId() + " | " + user.geteMail());
        }
        return null;
    }

}
