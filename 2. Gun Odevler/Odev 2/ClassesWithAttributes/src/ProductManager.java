public class ProductManager {
    public void add(Product product){
        //JDBC yoluyla eklenecek
        System.out.println("Ürün Eklendi : " + product.getName());
    }

    public void add2(int id,String name,String description, int stockAmount, double price){

    }
}
