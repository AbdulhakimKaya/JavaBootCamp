package odev1.Gun;

public class Loops {
    public static void main(String[] args) {


        // odev 3 -> playlistten 5-23 arasini izleyip uygula
        // uygulamalar ayri classlarda yapilmistir


        // loops (donguler)

        //for
        for (int i = 1; i <= 3; i++) {
            System.out.println(i);
        }
        System.out.println("for dongusu bitti");

        // while
        int i = 1;
        while (i <= 3) {
            System.out.println(i);
            i += 2;
        }
        System.out.println("while dongusu bitti");

        // do-while
        int j = 1;
        do {
            System.out.println(j);
            j += 2;
        } while (j < 3);
        System.out.println("do-while dongusu bitti");

        /* while dongusunde once sart soruldugu icin sart saglanmiyorsa dongu hic calistrilmaz ancak
        do-while dongusunde kod once bir kez calistirilir ve sonra sartin saglanip saglanmadigina bakilir */


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

        // foreach [arrays anlatilmadan foreach anlatilamazdi yani foreach de loops a dahil]

        for (String ogrenci : ogrenciler) {
            System.out.println(ogrenci);
        }
    }
}
