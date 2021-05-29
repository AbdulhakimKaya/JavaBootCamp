package HomeworkDay5.eCommerce.business.concretes;

import HomeworkDay5.eCommerce.business.abstracts.UserService;
import HomeworkDay5.eCommerce.entities.concretes.User;

import java.util.List;

public class UserManager implements UserService {
    @Override
    public void login(User user) {

    }

    @Override
    public void register(User user) {
        if(user.getFirstName().length()>2 && user.getLastName().length()>2 && user.getPassword().length()>6) {
            System.out.println("Kayit islemlerinin tamamlanmasi icin mailinize gonderilen dogrulama linkine tıklayınız.");
        }
        else {
            System.out.println("Hatali bilgi girisi yaptiniz.(ad-soyad 2 ve parola 6 karakterden buyuk olmalidir.)");
        }
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
    public boolean ifMailExist(User user) {
        return false;
    }

    @Override
    public boolean ifPasswordExist(User user) {
        return false;
    }
}
