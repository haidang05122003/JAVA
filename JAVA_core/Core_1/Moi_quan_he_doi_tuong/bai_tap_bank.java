package Moi_quan_he_doi_tuong;

class Customer
{
    private int id;
    private String name;
    private int discount;
    
    public Customer(int id, String name, int discount) {
        this.id = id;
        this.name = name;
        this.discount = discount;
    }
    public int getID(){
        return id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setDiscount(int discount) {
        this.discount = discount;
    }
    public int getDiscount() {
        return discount;
    }
}
class Invoice
{
    private int id;
    private Customer customer;
    private double amount;

    public Invoice( int id, Customer customer, double amount) {
        this.id = id;
        this.customer = customer;
        this.amount = amount;
    }
    public int getId() {
        return id;
    }
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    public Customer getCustomer() {
        return customer;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    public double getAmount() {
        return amount;
    }
    public String getCustomerName() {
        return customer.getName();
    }
    public double getAmountAfterDiscount() {
        return amount - (amount * customer.getDiscount()/100);
    }
}
public class bai_tap_bank {
    public static void main(String[] args) {
        Customer c = new Customer(01, "Dang", 20);
        Invoice i = new Invoice(01, c, 100000);
        System.out.println("Customer name: "+ i.getCustomerName());
        System.out.println("Invoice after discount: "+ i.getAmountAfterDiscount());
    }
    
}
