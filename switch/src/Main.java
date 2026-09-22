import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//task 1
        /*
        1) Artıq il (Leap Year) yoxlanışı
Sual: İlə verilən il ədədinin artıq il olub-olmadığını müəyyən edin.
Qayda: İl 4-ə bölünməlidir VƏ (100-ə bölünməməlidir YOXSA 400-ə bölünməlidir).
         */
//TASK 1 1 CI VARIANTI
        System.out.print("Enter a year: ");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();

        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        int status = isLeapYear ? 1 : 0;
        String message = switch (status) {
            case 1 -> "This is a leap year";
            default -> "This is not a leap year";
        };

        System.out.println(message);
//TASK 1 2-CI VARIANTI
        System.out.print("Enter a year: ");
        Scanner scanner5 = new Scanner(System.in);
        int year1 = scanner5.nextInt();

        boolean isFourDigitYear = (year1>=2000 && year1<=3000 );
        System.out.print(isFourDigitYear);
        int status1 = isFourDigitYear ? 1 : 0;
        String message1 = switch (status1) {
            case 1 -> "This is a leap year";
            default -> "This is not a leap year";
        };
        System.out.println(message1);
        //Task 2
        int month=0;
        String days = switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> "31 days";
            case 4, 6, 9, 11 -> "30 days";
            case 2 -> "28 or 29 days";
            default -> "Invalid month";
        };

        // Task 3
        System.out.println("Daxil edin Samit ve ya Sait herif ");
        Scanner scanner1 = new Scanner(System.in);
        String symbol = scanner1.nextLine();
        String checkSymbol = switch (symbol) {
            case "B", "C", "D", "F", "G", "H",
                 "J", "K", "L", "M", "N", "P", "Q", "R",
                 "S", "T", "V", "W", "X", "Y", "Z",
                 "b", "c", "d", "f", "g", "h",
                 "j", "k", "l", "m", "n", "p", "q", "r",
                 "s", "t", "v", "w", "x", "y", "z",
                 "ç", "ğ", "ş" -> "SAMİTDİR";

            case "a", "e", "ə", "i", "ı", "o", "ö", "u", "ü",
                 "A", "E", "Ə", "İ", "I", "O", "Ö", "U", "Ü" -> "SAİTDİR";

            default -> "DİGƏR SİMVOL";
        };

        System.out.println(checkSymbol);

        // Task 4
        System.out.println("Please write month number (1-12): ");
        int monthName = scanner.nextInt();
        String result = switch (monthName) {
            case 1 -> "Yanvar";
            case 2 -> "Fevral";
            case 3 -> "Mart";
            case 4 -> "Aprel";
            case 5 -> "May";
            case 6 -> "İyun";
            case 7 -> "İyul";
            case 8 -> "Avqust";
            case 9 -> "Sentyabr";
            case 10 -> "Oktyabr";
            case 11 -> "Noyabr";
            case 12 -> "Dekabr";
            default -> "Yanlış ay nömrəsi";
        };

        System.out.println(result);
    }
}