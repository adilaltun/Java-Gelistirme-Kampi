public class Main {
    public static void main(String[] args) {

        //Aynı isimli birden fazla method varsa bu durumda method overloading olur.

        DortIslem dortIslem = new DortIslem();
        int topla = dortIslem.topla(1, 3);
        System.out.println(topla);

        int topla1 = dortIslem.topla(2, 3, 4, 5, 6);
        System.out.println(topla1);
    }
}