public class Main {

    public static void main(String[] args) {
        //Arkadaş sayıları bulduran program
        // Bilinen en yakın arkadaş sayı ---> 220-284

        int number1 = 220;
        int number2 = 284;
        int toplam1 = 0;
        int toplam2 = 0;
        for (int i = 1; i < number1; i++) {
            if (number1%i==0){
                toplam1+=i;
            }
        }
        for (int i = 1; i< number2; i++){
            if (number2%i==0){
                toplam2+=i;
            }
        }
        if (number1==toplam2 && number2==toplam1){
            System.out.println("Arkadaş sayılardır.");
        }else {
            System.out.println("Arkadaş sayılar değildir.");
        }
    }
}