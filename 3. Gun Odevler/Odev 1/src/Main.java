import business.CustomerManager;
import business.CreditManager;
import credit.TeacherCreditManager;
import inheritance.Company;
import inheritance.Customer;
import inheritance.Person;

public class Main {
    public static void main(String[] args) {

        int sayi1 = 10;
        int sayi2 = 20;
        sayi1 = sayi2;
        sayi2 = 100;
        System.out.println(sayi1);

        int[] sayilar1 = new int[] {1,2,3};
        int[] sayilar2 = new int[] {10,20,30};
        sayilar1 = sayilar2;
        sayilar2[0] = 1000;
        System.out.println(sayilar1[0]);

        CreditManager creditManager = new CreditManager();
        creditManager.calculate();
        creditManager.save();

        //newlemek -> örneğini oluşturmak, instance oluşturmak, instance creation
        Customer customer = new Customer();
        customer.setId(1);
        System.out.println(customer);

        TeacherCreditManager teacherCreditManager = new TeacherCreditManager();
        CustomerManager customerManager = new CustomerManager(customer,teacherCreditManager);
        customerManager.save();
        customerManager.delete();

        Company company = new Company();
        company.setTaxNumber("10000");

        Person person = new Person();
        person.setNationalIdentity("1000");


        CustomerManager customerManager1 = new CustomerManager(new Person(),new TeacherCreditManager());
        customerManager1.giveCredit();



    }
}