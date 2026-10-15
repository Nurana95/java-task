
import java.io.*;

public class Main {
    public  static String createLog(int i){
        return "[INFO] Test mesaji nomre " + i + "\n";
    }
        public static void writePlain(int count) {
        try (FileOutputStream pw = new FileOutputStream("log_plain.txt")) {
            for (int i = 1; i <=count ; i++) {
                String log = createLog(i);
                pw.write(log.getBytes());
            }

        } catch (IOException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }}




    public  static  void writeBuffered(int count){
        try (BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("log_buffered.txt"))){
            for (int i = 0; i <=count ; i++) {
                String log = createLog(i);
                bos.write(log.getBytes());
            }
        } catch (IOException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        int count = 100_000;
        long startPlain = System.nanoTime();
        writePlain(count);
        long endPlain = System.nanoTime();
        double durationPlain = (endPlain - startPlain) / 1_000_000.0;
        System.out.printf("FileOutputStream ilə yazılma vaxtı: %.2f ms\n", durationPlain);

        long startBuffered = System.nanoTime();
        writeBuffered(count);
        long endBuffered = System.nanoTime();
        double durationBuffered = (endBuffered - startBuffered) / 1_000_000.0;
        System.out.printf("BufferedOutputStream ilə yazılma vaxtı: %.2f ms\n", durationBuffered);

    }
}