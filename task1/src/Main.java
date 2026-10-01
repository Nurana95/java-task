import java.time.LocalDateTime;

public class Main {


    public static void main(String[] args) {
        User a = new User("12345678", "ALI");
        System.out.println(a);
        System.out.println(a.checkPassword("12345678"));
        a.changePassword( "12345678","123456789");

Account b=new Account(1,401);
        System.out.println(b.getBalance()+" bu qeder balansda pul var ");
        b.withdraw(200);

        Student s = new Student(1, "ALI", -2, "22");
        System.out.println(s);

        A a1 = new A(1);
        A a2 = new A(1);
        A a3 = new A(1);

        System.out.println(a1.getCount());

        Transaction tr=new Transaction(0,"jj",20000L, LocalDateTime.now());
        System.out.println(tr.getTimeStamp());


    }}