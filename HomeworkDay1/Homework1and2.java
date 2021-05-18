package odev1.Gun;

public class Homework1and2 {
    public static void main(String[] args) {
        // odev 1 -> java'da kullanilan diger veri tiplerini arastir

        /* byte, short, int, long -> bu veri tipleri tam sayilari tutarlar. Farklari ise tutabilecekleri deger araliklaridir, ornegin;
        byte veri tipi -128 ile 127 araligindaki sayilari tutabilir daha kucuk veya daha buyuk sayilari tutamaz ve hata verir.
        * char -> tek karakter tutar ornegin; 'a','C' gibi..
        * String -> metinsel ifadeleri tutar ornegin; "Java ogreniyorum."
        * float ve double -> ondalikli sayilari tutarlar double daha hassastir yani ondalik kismi daha uzun yazilabilir
        * boolean -> true veya false deger dondurur
        ** genellikle tam sayilar icin int ve ondalikli sayilar icin double kullanilir.
        */

        int sayi = 1357911;
        byte sayi2 = 12;
        short sayi3 = 1234;
        long sayi4 = 1234567890;
        float sayi5 = 13;
        double sayi6 = 2.45678900753;
        char harf = 'm';
        String metin = "Java ogreniyorum";
        boolean sonuc = true;

        System.out.println(sayi);
        System.out.println(sayi2);
        System.out.println(sayi3);
        System.out.println(sayi4);
        System.out.println(sayi5);
        System.out.println(sayi6);
        System.out.println(harf);
        System.out.println(metin);
        System.out.println(sonuc);


        /* odev 2 -> altin.in sitesinde sart bloklariyla kodlanmis alanlar
                  eger dolar,euro,altin vb. bugun ciktiysa yukari yonlu ok eger dustuyse asagi yonlu ok */

    }
}
