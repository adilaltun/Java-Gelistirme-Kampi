public class Main {

    public static void main(String[] args) {

        /*Solid prensiplerinden
        S ---> Single Responsibility Principle -> Bir sınıf yalnızca bir işi yapar.
        Bir method yalnızca bir işi, bir if bloğu yalnızca bir işi yapar.
        Burada bu  prensibe uygun olarak: product kısmında product'a ait özellikleri
        ProductManager'da ise manager işlemlerini yaptık.*/

        Product product = new Product(1,"Laptop","Asus Laptop",3000,6,"Siyah");

        ProductManager productManager = new ProductManager();
        productManager.add(product);
        System.out.println(product.getKod());

        /*productManager.add2(1, "", "", 2, 200);
        productManager.add2(1, "", "", 2, 200);
        productManager.add2(1, "", "", 2, 200);
        productManager.add2(1, "", "", 2, 200);*/

    }
}