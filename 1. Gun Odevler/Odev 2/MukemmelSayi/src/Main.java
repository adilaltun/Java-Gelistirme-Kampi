public class Main {

    public static void main(String[] args) {
        // Mükemmel sayı mı değil mi kontrol eden program.
        // 6 --> 1,2,3
        //28 -->1,2,4,7,14

        int number = 28;
        int bolen = 0;

        for (int i = 1; i < number; i++) {
            if (number%i==0){
                bolen+=i;
            }
        }
        if (number==bolen){
            System.out.println("Mükemmel sayıdır.");
        }else {
            System.out.println("Mükemmel sayı değildir.");
        }
    }
}