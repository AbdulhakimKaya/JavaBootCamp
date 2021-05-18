package odev1.Gun;

public class Arrays {
    public static void main(String[] args) {


        // odev 3 -> playlistten 5-23 arasini izleyip uygula
        // uygulamalar ayri classlarda yapilmistir


        // arrays (diziler)
        String[] ogrenciler = new String[4];
        ogrenciler[0] = "Abdulhakim";
        ogrenciler[1] = "Erdem";
        ogrenciler[2] = "Cihat";
        ogrenciler[3] = "Erat";

        /* String[] ogrenciler = {abdulhakim,erdem,cihat,erat}
        yukaridakiyla ayni islem yapilmis olur yani dizi tanimlanir ve elemanlar atanir */

        for (int a = 0; a < ogrenciler.length; a++) {
            System.out.println(ogrenciler[a]);
        }


        // multi dimensional arrays

        String[][] sehirler = new String[3][3];
        sehirler[0][0] = "Istanbul";
        sehirler[0][1] = "Bursa";
        sehirler[0][2] = "Bilecik";
        sehirler[1][0] = "Konya";
        sehirler[1][1] = "Ankara";
        sehirler[1][2] = "Kayseri";
        sehirler[2][0] = "Diyarbakir";
        sehirler[2][1] = "Gaziantep";
        sehirler[2][2] = "Sanliurfa";
        for (int k = 0; k < sehirler.length; k++) {
            System.out.println("--------------------");
            for (int l = 0; l < sehirler.length; l++) {
                System.out.println(sehirler[k][l]);
            }
        }
    }
    }
