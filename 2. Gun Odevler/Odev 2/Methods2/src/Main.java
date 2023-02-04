public class Main {

    public static void main(String[] args) {

        //Substring bir değer döndüren bir method.
        String mesaj = "Bugün hava çok güzel";
        String yeniMesaj = sehirVer();
        System.out.println(yeniMesaj);
        int sayi = topla(15,7);
        System.out.println(sayi);
        int sayi1 = topla2(1,23,2,2,3,5);
        //int sayi2 = topla2(); -> bu durumda da hata alınmaz çünkü istediğimiz kadar parametre olduğundan istersek hiç göndermeyiz.
        System.out.println(sayi1);
    }

    //void operasyonlarda herhangi bir değer döndürmez.
    public static void ekle(){
        System.out.println("Eklendi.");
    }

    public static void sil(){
        System.out.println("Silindi.");
    }

    public static void guncelle(){
        System.out.println("Güncellendi.");
    }

    //void yerine int yazdık bu int bir değer döndüreceği anlamına gelir.
    public static int topla(int sayi1, int sayi2){
        return sayi1+sayi2;
    }

    //istediğimiz kadar int parametresi göndermek istediğimizde
    public static int topla2(int... sayilar){
        int toplam = 0;
        for (int sayi : sayilar){
            toplam+=sayi;
        }
        return toplam;
    }

    public static String sehirVer(){
        return "Ankara";
    }

}