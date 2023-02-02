public class Main {

    public static void main(String[] args) {

        // 1) Dizi elemanlarının toplamını yazdırın.
        // 2) Dizideki en büyük elemanı yazdırın.

        double[] myList = {1.2,7.6,4.3,5.6};
        double total=0;
        double enBuyuk = myList[0];
        for (double number : myList){
            if (enBuyuk<number){
                enBuyuk=number;
            }
            total+= number;
            System.out.println(number);
        }
        System.out.println("Toplam değer : " + total );
        System.out.println("En büyük double değeri : " + enBuyuk);
    }
}