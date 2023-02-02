public class Main {

    public static void main(String[] args) {
        int[] sayilar = new int[] {1,2,5,7,9,0};
        int aranacak = 15;

        boolean arananSayiBulundu = true;

        for (int arananSayi : sayilar){
            if (aranacak==arananSayi){
                arananSayiBulundu=true;
                break;
            }else {
                arananSayiBulundu=false;
            }
        }
        if (arananSayiBulundu==true){
            System.out.println("Aranan sayı bulundu.");
        }else {
            System.out.println("Aranan sayı bulunamadı.");
        }
    }
}