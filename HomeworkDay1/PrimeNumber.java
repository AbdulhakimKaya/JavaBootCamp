package HomeworkDay1;

public class PrimeNumber {
    public static void main(String[] args) {
        int number = -2;
        int remainder = number % 2;
        boolean isPrime = true;

        if (number==1) {
            System.out.println("1 sayisi asal degildir");
            return;
        }
        if (number<2) {
            System.out.println("gecersiz sayi");
            return;
        }
        for (int i=2;i<number;i++) {
            if(number % i == 0) {
                isPrime=false;
            }
        }
        if (isPrime) { // sadece isPrime yazarsan da true kabul eder yani isPrime == true yazmak ile aynidir
            System.out.println(number + " sayisi asaldir");
        }
        else {
            System.out.println(number + " sayisi asal degildir");
        }
    }
}
