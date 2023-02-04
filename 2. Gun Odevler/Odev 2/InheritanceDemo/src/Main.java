public class Main {

    public static void main(String[] args) {

        //Bir class yalnızca bir class'ı extend edebilir.
        /*OgretmenKrediManager ogretmenKrediManager = new OgretmenKrediManager();
        ogretmenKrediManager.hesapla();*/

        KrediUI krediUI = new KrediUI();
        krediUI.KrediHesapla(new AskerKrediManager());


    }
}