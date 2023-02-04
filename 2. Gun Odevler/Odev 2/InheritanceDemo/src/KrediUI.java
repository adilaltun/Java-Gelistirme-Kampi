public class KrediUI {

    /*BaseKrediManager --> OgretmenKrediManager'in de TarımKrediManager'in de referansını tutabilir.
    Ata sınıf olduğundan dolayı.*/
    public void KrediHesapla(BaseKrediManager baseKrediManager){
        baseKrediManager.hesapla();
    }

}
