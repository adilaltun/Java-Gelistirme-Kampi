package business;

import credit.ICreditManager;
import inheritance.Customer;

public class CustomerManager {

    //burada customer sınıfından _customer oluşturduk (global variable) sonrasında constructorda customer nesnesini
    //buraya verdiğimizde eklediğimiz customer verileri aşağıda save kısmında kullanabildik.
    private Customer _customer;
    private ICreditManager _creditManager;
    public CustomerManager(Customer customer,ICreditManager creditManager) {
        _customer = customer;
        _creditManager = creditManager;
    }

    public void save(){
        System.out.println("Müşteri kaydedildi : ");
    }

    public void delete(){
        System.out.println("Müşteri silindi : " );
    }

    public void giveCredit(){
        _creditManager.calculate();
        System.out.println("Kredi verildi.");
    }


}
