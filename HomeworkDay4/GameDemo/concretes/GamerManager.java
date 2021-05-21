package HomeworkDay4.GameDemo.concretes;

import HomeworkDay4.GameDemo.abstracts.GamerManagerService;
import HomeworkDay4.GameDemo.entities.Gamer;

public class GamerManager implements GamerManagerService {
    boolean isTrue = true;

    @Override
    public void authentication(Gamer gamer) {
        // kimlik dogrulama kodlari
        if (isTrue) {
            System.out.println(gamer.getFirstName() + " " + gamer.getLastName() + " Kimlik bilgileriniz dogrulandi.");
        }
        else {
            System.out.println("Hatali bilgi girdiniz... Lütfen bilgilerinizi kontrol ediniz.");
        }
    }
    @Override
    public void register(Gamer gamer) {
        // kayit olma kodlari
        System.out.println(gamer.getFirstName() + " " + gamer.getLastName() + " kullanicisinin kaydi tamamlanmistir.");
    }
    @Override
    public void update(Gamer gamer) {
        // kisi bilgileri guncelleme kodlari
        System.out.println(gamer.getFirstName() + " " + gamer.getLastName() + " kullanicisinin bilgileri guncellenmistir.");
    }
    @Override
    public void delete(Gamer gamer) {
        // kullanici silme kodlari
        System.out.println(gamer.getFirstName() + " " + gamer.getLastName() + " kullanicisinin kayitlari silinmistir.");
    }
}
