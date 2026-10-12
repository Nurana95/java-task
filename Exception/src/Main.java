import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//A1 İstifadəçidən Scanner ilə iki ədəd alın və bölün. InputMismatchException
// və ArithmeticException-ı ayrı-ayrı tutun.
// Düzgün giriş olana qədər təkrar soruşun.


                Scanner sc = new Scanner(System.in);

                while (true) {
                    try {
                        System.out.print("Birinci ədədi daxil edin: ");
                        int a = sc.nextInt();

                        System.out.print("İkinci ədədi daxil edin: ");
                        int b = sc.nextInt();

                        int netice = a / b;
                        System.out.println("Nəticə: " + a + " / " + b + " = " + netice);
                        break;

                    } catch (ArithmeticException e) {
                        System.out.println("Xəta: sıfıra bölmək olmaz! Yenidən cəhd edin.");
                    }
                }

                //A2 String[] names = {"Ali", "Vüsal", "Aysel"} massivi verilib.
        // İstifadəçidən indeks alın, elementi çap edin.
        // İndeks yanlışdırsa ArrayIndexOutOfBoundsException-ı tutub mesaj verin.

         String[] names = {"Ali", "Vüsal", "Aysel"};
        Scanner scanner = new Scanner(System.in);
        System.out.print("İndex  daxil edin: ");

        for (int n = 0; n < names.length; n++) {
try {
    int index = sc.nextInt();
    System.out.println("Element: " + names[index]);

}catch (ArrayIndexOutOfBoundsException e){
    System.out.println("Xəta: yalnız tam index 0 1 2 olmalidi !" );

}
        }

//A3 String array-dəki dəyərləri int-ə çevirin: {"12", "abc", "7", "", "3.5", "-4"}.
// Hər element üçün ya nəticəni,
// ya da “X: rəqəm deyil” mesajını çap edin.
// Sonda düzgün çevrilənlərin cəmini tapın

        String[] array= {"12", "abc", "7", "", "3.5", "-4"};
        int sum=0;
        for (String a:array){
            try {
                int n = Integer.parseInt(a);
                sum += n;

            }catch  (NumberFormatException e) {
                System.out.println(a + ": rəqəm deyil");

            }
        }

        System.out.println("Cəm: " + sum);



   //B1  Yaş yoxlaması (checked)
        //InvalidAgeException yaradın. registerUser(String name, int age)
        // metodu yaş 18-dən kiçik və ya 120-dən
        // böyükdürsə bu exception-ı atsın. main-də həm düzgün, həm yanlış halı yoxlayın.
        try {
            RegisterUsers.registerUser("Ali", 25);
        } catch (InvalidAge1Exception e) {
            System.out.println("Xəta: " + e.getMessage());
        }

        try {
            RegisterUsers.registerUser("Vüsal", 10);
        } catch (InvalidAge1Exception e) {
            System.out.println("Xəta: " + e.getMessage());}


        //C1 Təhlükəsiz parser
           // Aşağıdakı metodları yazın. Xəta olduqda exception atmasın,
        // default dəyər qaytarsın:


        System.out.println(parseIntorDefault("abc", -1));
        System.out.println(parseDoublerorDefault("abc", -1));


    }
    static int parseIntorDefault (String str, int def) {
        try {return Integer.parseInt(str);}
        catch (NumberFormatException e) {return def;}
    }
    static double parseDoublerorDefault (String str, double def) {
        try {return Double.parseDouble(str);}
        catch (NumberFormatException e) {return def;}
    }



}

