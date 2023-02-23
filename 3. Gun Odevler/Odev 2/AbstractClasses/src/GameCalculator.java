public abstract class GameCalculator {

    //zorunlu içi doldurulması gereken operasyondur.
    public abstract void hesapla();

    //gameOver değiştirilemez.
    public final void gameOver(){
        System.out.println("Oyununuz bitti.");
    }
}
