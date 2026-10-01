public class Account {
    private int id;
    private long balance ;

    public Account(int id, long balance) {
        this.id = id;
        this.balance = balance;
        setBalance(balance);
        setId(id);
    }

    public int getId() {
        return id;
    }

public void withdraw(long amount){
        if (amount>this.balance){
            System.out.println(this.balance+"bu qederdi sen cox cekmisen");

        }else {
            System.out.println((this.balance-amount)+"bu qeder qalib");

        }
}
    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", balance=" + balance +
                '}';
    }
    public void setId(int id) {
        this.id = id;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        if (balance>0){
        this.balance = balance;
    }else {
            System.out.println("musbet reqem olmalidi");

        }
    }
}
