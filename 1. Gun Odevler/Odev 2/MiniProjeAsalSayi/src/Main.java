public class Main {

    public static void main(String[] args) {

        //Soru: Asal sayı bulduran program.

        // % kalanı buldurmak için.
        int number = -20;
        int remainder = 0;
        boolean isPrime = true;

        if (number == 1) {
            System.out.println("Sayı asal değildir.");
        }

        if (number < 1) {
            System.out.println("Geçersiz bir sayı girdiniz.");
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
            }
        }
        if (number < 2) {
            System.out.println("Lütfen 2 ve 2'den büyük bir sayı giriniz.");
        } else {
            if (isPrime == true) {
                System.out.println("Sayı asaldır.");
            } else {
                System.out.println("Sayı asal değildir.");
            }
        }
    }
}