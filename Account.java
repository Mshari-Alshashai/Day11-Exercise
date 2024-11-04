public class Account {
    private String id;
    private String name;
    private int balance;

    public Account(String id,String name){
        this.id=id;
        this.name=name;
    }

    public Account(String id,String name,int balance){
        this.id=id;
        this.name=name;
        this.balance=balance;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int credit(int amount){
        if (amount>=0)balance=balance + amount;
        return balance;
    }

    public int debit(int amount){
        if (balance>=amount && amount>0)balance=balance - amount;
        return balance;
    }

    public String transferTo(Account a2,int amount){
        if (balance>=amount && amount>=0){
            balance=balance-amount;
            a2.balance=a2.balance+amount;
            return "The transfer has been completed";}
        else return "There was a problem with the process";
    }

    public String toString(){
        return ("Name: "+getName()+"\nID: "+getId()+"\nBalance: "+getBalance());
    }

}
