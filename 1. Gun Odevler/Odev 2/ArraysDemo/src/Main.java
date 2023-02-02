public class Main {

    public static void main(String[] args) {

        //Array - Diziler.
        String [] ogrenciler = new String[3];
        ogrenciler[0] = "Adil";
        ogrenciler[1] = "Zeynep";
        ogrenciler[2] = "Merve";
        //ogrenciler[3] = "Ahmet"; -> ArrayIndexOutOfBoundsException hatasını alırız.

        for (int i = 0; i < ogrenciler.length; i++) {
            System.out.println(ogrenciler[i]);
        }

        System.out.println("-----------------------------");

        //for(elemanlarınVeriTipiNe hangiDatayıTutuyor : neredekiData)
        for (String ogrenci : ogrenciler){
            System.out.println(ogrenci);
        }
    }
}