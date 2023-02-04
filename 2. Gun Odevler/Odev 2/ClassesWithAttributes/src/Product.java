public class Product {

    //Aynı isimli methodların aynı sınıf içerisinde bulunması overloading'e sebep olacaktır. Aşırı yüklenme
    //Constructorların biribirinden ayrılmalarını sağlayan şey içine aldığı parametrelerdir.
    public Product(int id,String name, String description, double price, int stockAmount, String renk){
        System.out.println("Yapıcı blok çalıştı.");
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.stockAmount = stockAmount;
        this.renk = renk;
    }

    public Product(){
    }

    //attribute or fields
    //attributelere belirtmediğin sürece default olarak public erişim belirteci gelir.
    private int id;
    private String name;
    private String description;
    private double price;
    private int stockAmount;
    private String renk;
    private String kod;

    //getter  -> atanan değerleri okumak, yazdırmak için kullanılır.
    public int get_id() {
        return id;
    }

    //setter -> değer atamak, değiştirmek içn kullanılır.
    public void set_id(int id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public String getKod() {
        return this.name.substring(0, 1) + id;
    }

}
