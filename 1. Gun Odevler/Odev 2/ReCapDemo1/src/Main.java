public class Main {

    public static void main(String[] args) {
        int sayi1 =30;
        int sayi2 = 25;
        int sayi3 = 29;

        int enBuyukSayi = sayi1;

        if (enBuyukSayi<sayi2){
            enBuyukSayi=sayi2;
        }
        if (enBuyukSayi<sayi3){
            enBuyukSayi=sayi3;
        }
        System.out.println("En büyük sayı : " + enBuyukSayi);

    }
}
