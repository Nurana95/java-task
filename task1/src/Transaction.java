import java.time.LocalDateTime;

public class Transaction {
    private static int countId=0;
    private final int id;
    private final String type;
    private final long amount;
    private final LocalDateTime timeStamp;


    public Transaction(int id, String type, long amount, LocalDateTime timeStamp) {
        this.id = ++countId;
        this.type = type;
        this.amount = amount;
        this.timeStamp = timeStamp;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", amount=" + amount +
                ", timeStamp=" + timeStamp +
                '}';
    }

    public int getId() {
        return id;
    }


    public String getType() {
        return type;
    }

    public long getAmount() {
        return amount;
    }

    public LocalDateTime getTimeStamp() {
        return timeStamp;
    }
}
