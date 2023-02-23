package inheritance;

import inheritance.Customer;

public class Person extends Customer {
    private String nationalIdentity;



    public String getNationalIdentity() {
        return nationalIdentity;
    }

    public void setNationalIdentity(String nationalIdentity) {
        this.nationalIdentity = nationalIdentity;
    }

    @Override
    public String toString() {
        return "inheritance.Person{" +
                "nationalIdentity='" + nationalIdentity + '\'' +
                '}';
    }
}
