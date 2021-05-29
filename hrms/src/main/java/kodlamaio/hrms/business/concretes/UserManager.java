package kodlamaio.hrms.business.concretes;

import kodlamaio.hrms.business.abstracts.UserService;
import kodlamaio.hrms.entities.abstracts.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserManager implements UserService {

    @Override
    public List<User> getAll() {
        return null;
    }
}

