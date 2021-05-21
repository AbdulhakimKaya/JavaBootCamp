package HomeworkDay4.GameDemo.abstracts;

import HomeworkDay4.GameDemo.entities.Gamer;

public interface GamerManagerService {
    void authentication(Gamer gamer);
    void register(Gamer gamer);
    void update(Gamer gamer);
    void delete(Gamer gamer);
}
