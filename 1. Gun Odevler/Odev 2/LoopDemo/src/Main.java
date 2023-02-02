public class Main {

    public static void main(String[] args) {
        //For Döngüsü
        for (int i = 1; i < 10 ; i+=2) {
            System.out.println(i);
        }
        System.out.println("For Döngüsü Bitti.");

        int i =1;
        //While Döngüsü -> Eğer i++ yapmazsak infinite loop olacaktır.
        while (i<10){
            System.out.println(i);
            i+=2;
        }
        System.out.println("While Döngüsü Bitti.");

        //Do-While Döngüsü -> Koşulu sağlamasa bile en az bir kere çalışır.
        int j=1;
        do {
            System.out.println(j);
            j+=2;
        }while (j<10);
        System.out.println("Do-While Döngüsü Bitti.");
    }
}