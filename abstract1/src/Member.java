import java.util.Arrays;

public class Member {
  private  int id;
    private String name;
    private int borrowCount;
    private Item1[] borrowItems;

    public Member(int id, String name, int borrowCount) {
        this.id = id;
        this.name = name;
        this.borrowCount = borrowCount;
        this.borrowItems =  new Item1[3];
    }

    @Override
    public String toString() {
        return "Member{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", borrowCount=" + borrowCount +
                ", borrowItems=" + Arrays.toString(borrowItems) +
                '}';
    }

    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }


    public int getBorrowCount() {
        return borrowCount;
    }


    public Item1[] getBorrowItems() {
        return borrowItems;
    }

}
