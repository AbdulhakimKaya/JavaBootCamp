package HomeworkDay4.GameDemo.concretes;

import HomeworkDay4.GameDemo.abstracts.GamesManagerService;
import HomeworkDay4.GameDemo.entities.Games;

public class GamesManager implements GamesManagerService {
    @Override
    public void add(Games games) {
        System.out.println(games.getGameName() + " adli oyun basariyla eklendi");
    }

    @Override
    public void delete(Games games) {
        System.out.println(games.getGameName() + " adli oyun basariyla silindi");

    }

    @Override
    public void update(Games games) {
        System.out.println(games.getGameName() + " adli oyun basariyla guncellendi");

    }
}
