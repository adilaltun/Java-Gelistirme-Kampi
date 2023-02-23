public class CustomerManager {

    //burada BaseDatabaseManager enjekte ediyoruz ki kullanabilelim.
    BaseDatabaseManager databaseManager;

    public void getCustomers(){
        databaseManager.getData();
    }
}
