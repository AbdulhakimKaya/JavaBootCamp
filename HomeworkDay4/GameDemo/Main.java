package HomeworkDay4.GameDemo;

import HomeworkDay4.GameDemo.concretes.CampaignManager;
import HomeworkDay4.GameDemo.concretes.GamerManager;
import HomeworkDay4.GameDemo.concretes.GamesManager;
import HomeworkDay4.GameDemo.concretes.SellManager;
import HomeworkDay4.GameDemo.entities.Campaign;
import HomeworkDay4.GameDemo.entities.Gamer;
import HomeworkDay4.GameDemo.entities.Sell;

public class Main {
    public static void main(String[] args) {
        Campaign campaign1 = new Campaign();
        campaign1.setId(1);
        campaign1.setName("Student Discount");
        campaign1.setDiscount(15);

        Campaign campaign2 = new Campaign();
        campaign2.setId(2);
        campaign2.setName("New Year Discount");
        campaign2.setDiscount(10);

        CampaignManager campaignManager = new CampaignManager();

        campaignManager.add(campaign1);
        campaignManager.add(campaign2);

        campaign1.setDiscount(18);
        campaignManager.update(campaign1);

        campaignManager.delete(campaign2);

        Gamer gamer1 = new Gamer(1, "Abdulhakim", "KAYA", "30/08/2002", "12345678910", "Kaya99");
        Gamer gamer2 = new Gamer(2, "Engin", "DEMIROG", "06/01/1985", "10987654321", "Engin21");
        Gamer gamer3 = new Gamer(3, "Tarik Kaan", "KOC", "07/10/2002", "13579246810", "Koc1");

        GamerManager gamerManager = new GamerManager();

        gamerManager.authentication(gamer1);
        gamerManager.register(gamer1);

        gamerManager.authentication(gamer2);
        gamerManager.register(gamer2);

        gamer2.setNickName("Demirog99");
        gamerManager.update(gamer2);

        gamerManager.authentication(gamer3);
        gamerManager.register(gamer3);
        gamerManager.delete(gamer3);

        Sell game1 = new Sell(1, "PES 2021", 100);
        Sell game2 = new Sell(2, "FIFA 2021", 110);
        Sell game3 = new Sell(3, "NBA 2k21", 120);

        GamesManager gamesManager = new GamesManager();

        gamesManager.add(game1);
        gamesManager.add(game2);
        gamesManager.add(game3);

        game2.setUnitPrice(125);
        gamesManager.update(game2);

        gamesManager.delete(game3);

        SellManager sellManager = new SellManager();
        sellManager.gamesSale(gamer2, game2);
        sellManager.saleOfDiscountedGames(gamer1, campaign1, game1);

    }
}