public class N {
    abstract class Item {
        protected int id;
        protected String title;

        Item(int id, String title) {
            this.id = id;
            this.title = title;
        }

        abstract int getLoanDays();

        public String toString() {
            return "#" + id + " " + title + " (loan: " + getLoanDays() + " days)";
        }
    }

    class Book extends Item {
        private String author;

        Book(int id, String title, String author) {
            super(id, title);
            this.author = author;
        }

        int getLoanDays() { return 14; }

        public String toString() { return "Book " + super.toString() + ", author: " + author; }
    }

    class DVD extends Item {
        private int duration;

        DVD(int id, String title, int duration) {
            super(id, title);
            this.duration = duration;
        }

        int getLoanDays() { return 3; }

        public String toString() { return "DVD " + super.toString() + ", duration: " + duration + " min"; }
    }

    class Member {
        int id;
        String name;
        Item[] borrowedItems = new Item[3];
        int borrowCount = 0;

        Member(int id, String name) {
            this.id = id;
            this.name = name;
        }

        boolean borrow(Item item) {
            if (borrowCount >= borrowedItems.length) return false;
            borrowedItems[borrowCount++] = item;
            return true;
        }

        void print() {
            System.out.println(name + " (id " + id + ") borrowed " + borrowCount + " item(s):");
            for (int i = 0; i < borrowCount; i++) {
                System.out.println("  - " + borrowedItems[i]);
            }
        }
    }

    class Library {
        Item[] items = new Item[50];
        int itemCount = 0;
        Member[] members = new Member[50];
        int memberCount = 0;

        void addItem(Item item) {
            if (itemCount < items.length) items[itemCount++] = item;
        }

        void addMember(Member m) {
            if (memberCount < members.length) members[memberCount++] = m;
        }

        void printAll() {
            System.out.println("=== Items ===");
            for (int i = 0; i < itemCount; i++) System.out.println(items[i]);
            System.out.println("=== Members ===");
            for (int i = 0; i < memberCount; i++) members[i].print();
        }
    }

    public class Main {
        public static void main(String[] args) {
            Library lib = new Library();

            Item b1 = new Book(1, "Clean Code", "Robert Martin");
            Item b2 = new Book(2, "Effective Java", "Joshua Bloch");
            Item d1 = new DVD(3, "Inception", 148);
            Item d2 = new DVD(4, "Interstellar", 169);
            lib.addItem(b1);
            lib.addItem(b2);
            lib.addItem(d1);
            lib.addItem(d2);

            Member m1 = new Member(1, "Aysel");
            Member m2 = new Member(2, "Orxan");
            lib.addMember(m1);
            lib.addMember(m2);

            m1.borrow(b1);
            m1.borrow(d1);
            m2.borrow(b2);
            m2.borrow(d2);
            m2.borrow(b1);
            System.out.println("Orxan 4th borrow allowed? " + m2.borrow(d1)); // false: limit is 3

            lib.printAll();
        }
    }
}
