package HomeworkDay1;

public class SwitchCase {
    public static void main(String[] args) {


        // odev 3 -> playlistten 5-23 arasini izleyip uygula
        // uygulamalar ayri classlarda yapilmistir


        // switch case
        char grade = 'A';
        switch (grade) {
            case 'A':
                System.out.println("mukemmel : gectiniz");
                break;
            case 'B':
            case 'C':  // B ve C durumlarinin ikisi icin de ayni sonuc yazdirilir
                System.out.println("iyi : gectiniz");
                break;
            case 'D':
                System.out.println("fena degil : gectiniz");
                break;
            case 'F':
                System.out.println("cok kotu : kaldiniz");
                break;
            default:
                System.out.println("gecersiz not girdiniz");
        }
    }
}
