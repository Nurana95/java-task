public class Book extends Item1 {
   private String author;


    @Override
    int getLoanDays() {
        return 14;
    }
}
