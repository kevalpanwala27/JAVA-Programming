class Account {
    private String accNo;
    private String name;
    private String address;
    private String phone_No;
    private String dob;
    protected long balance;

    public Account(String acc,String n,String add,String phone_No,String dob) {
        accNo=acc;
        name=n;
        address=add;
        this.phone_No =phone_No;
        this.dob=dob;
        balance=0;
    }
    public String getAccNo(){
        return accNo;
    }
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public String getPhone_No(){
        return phone_No;
    }
    public String getDOB(){
        return dob;
    }
    public long getBalance(){
        return balance;
    }
    public void setAddress(String add) {
        address=add;
    }
    public void setPhone_No(String phone_No) {
        this.phone_No = phone_No;
    }
}

class SavingsAccount extends Account {
    public SavingsAccount(String acc, String n, String add, String phone_No, String dob) {
        super(acc, n, add, phone_No, dob);
    }
    public void deposit(long amt) {
        balance+=amt;
    }
    public void withdraw(long amt) {
        balance-=amt;
    }
}

class LoanAccount extends Account {
    public LoanAccount(String acc, String n, String add, String phone_No, String dob) {
        super(acc, n, add, phone_No, dob);
    }
    public void payEMI(long amt) {
        balance-=amt;
    }
    public void repay(long amt) {
        if(balance==amt)
            balance=0;
    }
}

public class std_chlg_inheritance_account {
    public static void main(String[] args) {

    }
}
