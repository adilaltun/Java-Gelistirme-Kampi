public class Main {
    public static void main(String[] args) {

        /*OgretmenKrediManager ogretmenKrediManager = new OgretmenKrediManager();
        double hesapla = ogretmenKrediManager.hesapla(1000);
        System.out.println(hesapla);*/

        BaseKrediManager[] baseKrediManagers = new BaseKrediManager[]
                {new OgretmenKrediManager(), new TarimKrediManager(), new OgrenciKrediManager() };

            for (BaseKrediManager baseKrediManager: baseKrediManagers){
                System.out.println(baseKrediManager.hesapla(1000));
            }
    }
}