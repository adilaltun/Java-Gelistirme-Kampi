public class Main {
    public static void main(String[] args) {

        /* Inheritance -> bir sınıfın kendine ait özellikleri başka sınıfa aktarması (miras vermesi olayıdır.)
        extends anahtar kelimesi ile gerçekleştirilir ve bir sınıf yalnızca sadece bir sınıfı extends edebilir
        kendine miras alabilir.
        * */
        Customer customer = new Customer();
        Employee employee = new Employee();

        EmployeeManager employeeManager = new EmployeeManager();
        CustomerManager customerManager = new CustomerManager();


    }
}