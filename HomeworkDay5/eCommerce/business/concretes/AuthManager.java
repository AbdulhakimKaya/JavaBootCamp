package HomeworkDay5.eCommerce.business.concretes;

import HomeworkDay5.eCommerce.business.abstracts.AuthService;
import HomeworkDay5.eCommerce.business.abstracts.UserService;
import HomeworkDay5.eCommerce.core.GoogleAuthManagerAdapter;
import HomeworkDay5.eCommerce.entities.concretes.User;

public class AuthManager implements AuthService {


    private UserService userService;

    public AuthManager(UserService userService) {
        this.userService = userService;
    }

    @Override
    public void signIn(User user) {
        if(isVerify(user) && userService.isMailExist(user) && userService.isPasswordExist(user)){
            System.out.println("Giriş Yapıldı");
        }
        else{
            System.out.println("Giriş Yapılmadı doğrulanmamış veya email ya da şifre uyuşmadı.");
        }

    }

    @Override
    public void signUp(User user) {
        userService.add(user);
        String code = randGenerator(user);
        System.out.println(code + " Doğrulama Kodunuz Gönderildi.");
        user.setVerifiedCode(code);
    }

    @Override
    public void signInWithGoogle(User user) {

        if(isVerify(user)){
            if(!userService.isMailExist(user)){
                userService.add(user);
                user.setVerified(true);
            }
            else{
                User user_ = userService.get(user.getId());
                user_.setVerified(true);
            }
            GoogleAuthManagerAdapter adapter = new GoogleAuthManagerAdapter();
            adapter.login(user.geteMail(), user.getPassword());
            return;

        }
        System.out.println("Doğrulunamadı");



    }

    @Override
    public void getVerifyState(User user, String kod) {
        User verifyUser  = userService.get(user.getId());
        if(kod.equals(user.getVerifiedCode())){
            verifyUser.setVerified(true);
            System.out.println("Başarıyla Doğrulandı");
        }
    }


    private String randGenerator(User user){
        int generated = (int)Math.floor(Math.random() * 8888);
        return generated + " " + user.getFirstName().substring(0,2) + " " +user.getLastName().substring(0,2);
    }


    private boolean isVerify(User user){
        if(user.isVerified() && (user.geteMail().isBlank() && user.geteMail() == null) && (user.getPassword().isBlank() && user.getPassword() == null) ){
            return false;
        }
        return true;
    }
}
