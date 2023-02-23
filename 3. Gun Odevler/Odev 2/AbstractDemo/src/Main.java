public class Main {
    public static void main(String[] args) {

        /*Solid prensiplerinden O yani Open-Closed principle der ki : uygulamamızda bir yenilik getirdiğinde
        bir şeyleri değiştiremezsin. Değiştiriyorsan eğer sıkıntı var demektir. Yani bir uygulama gelişime açık
        değişime kapalı olmalıdır.
        Buradaki örnek ise biz yeni bir database bağlantı sistemi getirdik ve burada kodlarımızda hiçbir değişiklik
        yapmadık.
        */

        /* Abstract sınıflar new anahtar kelimesi ile nesnesi oluşturulamaz. Sınf özelliği gösterirler ve yalnız bir
        sınıfı extend edilebilir bir sınıfa extend edilebilirler. Encapsulation kelime anahtarları olan (public,private vb.)
        anahtar kelimeleri alabilirler. İçlerinde gövdeli ve gövdesiz metotları barındırabilirler.
        */

        CustomerManager customerManager = new CustomerManager();
        customerManager.databaseManager = new MySqlDatabaseManager();
        customerManager.getCustomers();

    }
}