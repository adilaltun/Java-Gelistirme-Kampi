public class DortIslem {


    /* Method Overloading -> aşağıda gösterildiği gibi aynı isimli birden fazla methodumuz varsa gerçekleşir.
    birbirlerinden içlerine aldıkları parametreler sayesinde ayrılırlar.
    */
    public int topla (int sayi1, int sayi2){
        int toplam = sayi1 + sayi2;
        return toplam;
    }

    public int topla (int sayi1, int sayi2,int sayi3){
        int toplam = sayi1 + sayi2 + sayi3;
        return toplam;
    }
}
