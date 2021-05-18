package odev1.Gun;

public class Strings {

        public static void main(String[] args) {
            // odev 3 -> playlistten 5-23 arasini izleyip uygula
            // uygulamalar ayri classlarda yapilmistir

            String message = "I love you";

            System.out.println(message);
            System.out.println("Eleman sayisi : " + message.length());
            System.out.println("3.eleman : " + message.charAt(2));
            System.out.println(message.concat(" darling"));
            System.out.println(message.startsWith("I")); // I harfi ile basliyor mu diye sorarak bool cevap aliriz
            System.out.println(message.endsWith("U")); //U harfi ile bitiyor mu diye sorarak bool cevap aliriz (false cevap aliriz cunku kucuk u ile bitiyor)

            char[] karakterler = new char[4];
            message.getChars(0,4,karakterler,0);
            System.out.println(karakterler);

            System.out.println(message.indexOf("o"));       //soldan ilk o harfinin indexini yazdirir
            System.out.println(message.lastIndexOf("o"));   //sagdan ilk o harfinin indexini yazdirir

            System.out.println(message.replace(' ','*'));  //yer degistirme yapar bosluk olan yerlere * yazar
            System.out.println(message.substring(2));     //2.indexten sonrasini yazdirir
            System.out.println(message.substring(2,6));   //2.indexten 6.indexe kadar yazdirir (6.index dahil degil)

            for (String kelime : message.split(" ")) {
                System.out.println(kelime);
                // cumleyi bosluklardan ayirir ve her kelimeyi ayri ayri yazdirir
            }

            System.out.println(message.toLowerCase());  // her harfi kucuk yazdirir
            System.out.println(message.toUpperCase());  // her harfi buyuk yazdirir

            String message2 = "     I love you     ";
            System.out.println(message2.trim());  // bastaki ve sondaki bosluklari keser


        }
}
