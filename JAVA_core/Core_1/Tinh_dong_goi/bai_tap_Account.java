package Tinh_dong_goi;

class Account
{
    private int id;
    private String name;
    private int balance = 0;

    public Account(int id, String name) {
        this.id= id;
        this.name = name;
    }
    public Account(int id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }
    public int getId() {
        return id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public int getBalance() {
        return balance;
    }
    public void deposit(int amount) {
        this.balance+=amount;
        return;
    }
    public void withdraw(int amount) {
        if(balance < amount)
        {
            System.out.println("That amount exceeds your current balance.​");
        }
        else
            this.balance-=amount;
        return;
    }
    public void display() {
        System.out.println("Id :"+ id);
        System.out.println("Name :"+name);
        System.out.println("Balance: "+ balance);
    }
}
public class bai_tap_Account {
    public static void main(String[] args) {
        Account account = new Account(101, "Dang",2000);
        account.display();
        account.withdraw(2100);
        account.deposit(600);
        System.out.println("Balance: "+account.getBalance());
        account.withdraw(2100);
        System.out.println("Balance: "+account.getBalance());

       
    }
}
