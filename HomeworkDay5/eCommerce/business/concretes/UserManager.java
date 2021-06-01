package HomeworkDay5.eCommerce.business.concretes;

import HomeworkDay5.eCommerce.business.abstracts.UserService;
import HomeworkDay5.eCommerce.dataAccess.abstracts.UserDao;
import HomeworkDay5.eCommerce.entities.concretes.User;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserManager implements UserService {

    private UserDao userDao;


    public UserManager() {

    }

    public UserManager(UserDao userDao) {
        this.userDao = userDao;
    }

    // xxxxx
    @Override
    public void add(User user) {
        if(isValid(user) && isMailExist(user)){
            userDao.add(user);
            System.out.println("Kullanıcı eklendi");
        }
    }

    @Override
    public void update(User user) {
        this.userDao.update(user);
    }

    @Override
    public void delete(User user) {
        this.userDao.delete(user);
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
    public boolean isMailExist(User user) {
        return false;
    }

    @Override
    public boolean isPasswordExist(User user) {
    return false;
    }

    @Override
    public boolean isValid(User user) {

        String regex = "^(.+)@(.+)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(user.geteMail());
        if (!matcher.matches()){
            System.out.println("Lütfen E-nzi Kontrol Edin. Eksik Veya Hatalı E-Posta Adresi Girdiniz !");
            return false;

        }
        else if (user.getFirstName().length()<2 && user.getLastName().length()<2) {
            System.out.println("İsim ve soyisim 2 harften uzun olmalıdır.");
            return false;
        }
        else if (user.getPassword().length()<6) {
            System.out.println("Parola 6 karakterden uzun olmalıdır.");
            return false;
        }
        return true;
    }
}
