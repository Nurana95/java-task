import java.util.Arrays;

public class Library  {

    private Item1[] x;
    private int itemCount;
    private Member[] memberCount;

    public Library(Item1[] x, int itemCount, Member[] memberCount) {
        this.x = new Item1[10];
        this.itemCount = itemCount;
        this.memberCount = new Member[10];
    }

    public Item1[] getX() {
        return x;
    }

    public void setX(Item1[] x) {
        this.x = x;
    }

    @Override
    public String toString() {
        return "Library{" +
                "x=" + Arrays.toString(x) +
                ", itemCount=" + itemCount +
                ", memberCount=" + Arrays.toString(memberCount) +
                '}';
    }

    public int getItemCount() {
        return itemCount;
    }

    public void setItemCount(int itemCount) {
        this.itemCount = itemCount;
    }

    public Member[] getMemberCount() {
        return memberCount;
    }

    public void setMemberCount(Member[] memberCount) {
        this.memberCount = new Member[10];
    }


}
