package HomeworkDay1;

public class PerfectNumber {
    public static void main(String[] args) {
        int number = -28;
        int total = 0;

        if (number>0){
            for (int i = 1; i < number; i++) {
                if (number % i == 0) {
                    total = total + i;
                }
            }
            if (total == number) {
                System.out.println(number + " mukemmel sayidir");
            } else {
                System.out.println(number + " mukemmel sayi degildir");
            }
        }
        else {
            System.out.println("pozitif bir sayi giriniz..");
        }
    }
}
