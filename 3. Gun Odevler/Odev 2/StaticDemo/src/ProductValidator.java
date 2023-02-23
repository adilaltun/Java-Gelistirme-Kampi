public class ProductValidator {

    //Static yapıcı blok örneği
    static {
        System.out.println("Static yapıcı blok çalıştı.");
    }
    public static boolean isValid(Product product){
        if (product.price>0 && !product.name.isEmpty()){
            return true;
        }else  {
            return false;
        }
    }

    public void biSey(){

    }

    //Inner class
    public static class BaskaBirClass{
        public static void sil(){

        }
    }


}
