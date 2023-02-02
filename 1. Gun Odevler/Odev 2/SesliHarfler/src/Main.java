public class Main {

    public static void main(String[] args) {

        //Soru: Sesli harflerin tipini yazdıran program
        char harf = 'A';

        //Eğer aynı sonucu yazdırmak istiyorsak aşağıdaki gibi caselerimizi alt alta yazabiliriz.
        switch (harf){
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Kalın sesli harf.");
                break;
            default:
                System.out.println("İnce sesli harf.");
        }
    }
}