package HomeworkDay4.GameDemo.concretes;

import HomeworkDay4.GameDemo.abstracts.CampaingManagerService;
import HomeworkDay4.GameDemo.entities.Campaign;

public class CampaignManager implements CampaingManagerService {

    @Override
    public void add(Campaign campaign) {
        // kampanya ekleme kodlari
        System.out.println(campaign.getName() + " kampanyasi eklendi.");
    }

    @Override
    public void delete(Campaign campaign) {
        // kampanya silme kodlari
        System.out.println(campaign.getName() + " kampanyasi silindi.");
    }

    @Override
    public void update(Campaign campaign) {
        // kampanya guncelleme kodlari
        System.out.println(campaign.getName() + " kampanyasi guncellendi.");
    }
}
