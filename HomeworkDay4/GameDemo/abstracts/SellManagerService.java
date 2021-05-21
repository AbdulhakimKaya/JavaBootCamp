package HomeworkDay4.GameDemo.abstracts;

import HomeworkDay4.GameDemo.entities.Campaign;
import HomeworkDay4.GameDemo.entities.Gamer;
import HomeworkDay4.GameDemo.entities.Sell;

public interface SellManagerService {

    void gamesSale(Gamer gamer, Sell sell);
    void saleOfDiscountedGames(Gamer gamer, Campaign campaign, Sell sell);


}
