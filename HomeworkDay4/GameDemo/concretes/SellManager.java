package HomeworkDay4.GameDemo.concretes;


import HomeworkDay4.GameDemo.abstracts.SellManagerService;
import HomeworkDay4.GameDemo.entities.Campaign;
import HomeworkDay4.GameDemo.entities.Gamer;
import HomeworkDay4.GameDemo.entities.Sell;

public class SellManager implements SellManagerService {

    @Override
    public void gamesSale(Gamer gamer, Sell sell) {
        System.out.println(gamer.getFirstName() + " adli oyuncu " + sell.getGameName() + " adli oyunu " + sell.getUnitPrice() + " TL'ye satin aldi.");
    }

    @Override
    public void saleOfDiscountedGames(Gamer gamer, Campaign campaign, Sell sell) {
        System.out.println(gamer.getFirstName() + " adli oyuncu " + sell.getGameName() + " adli oyunu " +
                           campaign.getName() + " adli kampanyasindan faydalanarak " + " %" + campaign.getDiscount() +
                          " indirim ile " + campaign.getUnitPriceAfterDiscount(sell.getUnitPrice()) + " TL'ye satin aldi.");
    }


}