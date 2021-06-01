package HomeworkDay5.eCommerce;

import HomeworkDay5.eCommerce.business.concretes.UserManager;
import HomeworkDay5.eCommerce.entities.concretes.User;
import HomeworkDay5.eCommerce.googleAuth.GoogleAuthManager;

public class Main {
    public static void main(String[] args) {

        User user1 = new User();
        user1.setFirstName("Abdulhakim");
        user1.setLastName("KAYA");
        user1.setId(1);
        user1.seteMail("abdulhakimkaya2199@gmail.com");
        user1.setPassword("1234567");

        UserManager manager1 = new UserManager();
        manager1.update(user1);

        System.out.println("************");

        User user2 = new User();
        user2.setFirstName("Engin");
        user2.setLastName("DEMIROG");
        user2.setId(2);
        user2.seteMail("engindemirog21@gmail.com");
        user2.setPassword("engin21");

        GoogleAuthManager manager = new GoogleAuthManager();
        manager.register(user1.geteMail(),user1.getPassword());
    }
}
