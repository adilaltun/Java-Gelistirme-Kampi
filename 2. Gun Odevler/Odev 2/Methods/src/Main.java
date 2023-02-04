public class Main {

    public static void main(String[] args) {

        sayiBulmaca();
        sayiBulmaca();
        sayiBulmaca();
    }

    //public -> access modifier
    //void -> return type
    //sayiBulmaca -> method name
    //methodlar camelCase türünde isimlendirilirler.
    public static void sayiBulmaca(){
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
        String mesaj = "";
        if (arananSayiBulundu==true){
            mesaj ="Sayı mevcuttur : " + aranacak;
            mesajVer(mesaj);
        }else {
            mesaj = "Aranan sayı bulunamadı : " + aranacak;
            mesajVer(mesaj);
        }

    }

    public static void mesajVer(String mesaj){
        System.out.println(mesaj);
    }
}