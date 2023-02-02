import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        //Stingler bir karakter dizisidir.

        String mesaj = "Bugün hava çok güzel.";
        System.out.println(mesaj);

        System.out.println("Eleman Sayısı : " + mesaj.length());

        //indexler 0'dan başladığı için 4. index 5. elemanı verir.
        System.out.println("5. Eleman : " + mesaj.charAt(4)); //çıktımız: n'dir.

        /*İki stringi birleştirmek için. Daha sonra yeni şekilde kullanılmak istenirse bir
        String değişkenine atamamız lazımdır.*/
        System.out.println(mesaj.concat(" Yaşasın!")); // Yeni çıktımız Bugün hava çok güzel. Yaşasın!

        //ile başlar - ile biter (boolean sonuç döndürür)
        System.out.println(mesaj.startsWith("A")); //A ile başlamadığı için false döndürür.
        System.out.println(mesaj.endsWith("."));  //. ile bittiğinden dolayı true döndürür.

        //Karakterleri almak için
        char[] karakterler = new char[5];
        mesaj.getChars(0,5,karakterler,0);
        System.out.println(karakterler);

        //Belirtilen karakterin veya String'in kaçıncı eleman olduğunu yazdıran
        System.out.println(mesaj.indexOf('a')); //baştan başlayarak index numarasını verir.
        System.out.println(mesaj.lastIndexOf('a')); //sondan bakmaya başlar. Fakat baştan index numarasını verir.

        //Karakterleri değiştirmek için -> yeniden kullanmak için yeni bir değişkene atmak lazımdır.
        System.out.println(mesaj.replace(' ','-'));

        //Belirtilen indexten sonrasını almak için substring kullanılır.
        System.out.println(mesaj.substring(2));

        //Belirtilen indexler arasını almak için yine substring kullanılır.
        System.out.println(mesaj.substring(2,5));
        
        //Bir metni parçalamak için split kullanılır. Ve dizi döndürür.
        for (String kelime: mesaj.split(" ")) {
            System.out.println(kelime);
        }

        //String ifademizin hepsini KÜÇÜK harf yaptırmak için toLowerCase kullanılır.
        System.out.println(mesaj.toLowerCase(Locale.ROOT));

        //String ifademizin hepsini BÜYÜK harf yaptırmak için toUpperCase kullanılır.
        System.out.println(mesaj.toUpperCase());

        //String ifadenin başında ve sonundaki boşlukları atmak için trim() kullanılır.
        System.out.println(mesaj.trim());
    }
}