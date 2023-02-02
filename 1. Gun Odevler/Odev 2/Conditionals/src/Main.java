public class Main {
    public static void main(String[] args) {

        //if-else bloklarında mutlaka birisi çalışır. Yani ya if ya da else kısmı çalışır. İkisi aynı anda çalışmaz.
        //defensive programing -> veri kaçaklarını önlemek için.
        int sayi = 19;
        if (sayi<20){
            System.out.println("Sayı 20'den küçüktür.");
        }else if (sayi==20){
            System.out.println("Sayı 20'ye eşittir.");
        }else {
            System.out.println("Sayı 20'den büyüktür.");
        }
    }
}
