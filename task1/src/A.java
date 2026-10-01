public class A {
    private  int id;
    private static int count;

    public A(int id) {
        this.id = id;
        count++;

    }
    public static int getCount() {
        return count;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "A{" +
                "id=" + id +
                '}';
    }
}