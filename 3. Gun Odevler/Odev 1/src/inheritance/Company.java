package inheritance;

public class Company extends Customer {
    private String taxNumber;

    public String getTaxNumber() {
        return taxNumber;
    }

    public void setTaxNumber(String taxNumber) {
        this.taxNumber = taxNumber;
    }

    @Override
    public String toString() {
        return "inheritance.Company{" +
                "taxNumber='" + taxNumber + '\'' +
                '}';
    }
}
