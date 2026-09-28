import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Ev tapsiriqi:

1) Verilmiş n ədədinin faktorialını hesablayan metod yaz.

2) İlk n Fibonacci ədədini qaytaran metod yaz

3) Verilmiş ədədin sadə (prime) olub-olmadığını yoxlayan metod yaz.

4) Verilmiş sözün palindrom olub-olmadığını yoxla

5) Verilmiş ədədin rəqəmlərini toplayan metod yaz.

6) base ədədini exponent dərəcəsinə yüksəldən öz metodunu yaz (Math.pow istifadə etmədən).

7) Verilmiş ədədi tərsinə çevirən metod yaz.

8) Verilmiş ədədin neçə rəqəmdən ibarət olduğunu hesablayan metod yaz.

9) Verilmiş ədədin Armstrong ədədi olub-olmadığını yoxlayan metod yaz.
 (Armstrong ədədi — rəqəmlərinin,
 rəqəm sayı qədər dərəcəyə yüksəldilmiş cəmi, ədədin özünə bərabər olur.)
         */
//task 3
        int number = 9;
        boolean isPrime = true;

        for (int i = 2; i < number; i++) {

            if (number % i == 0) {
                isPrime = false;
                break;
            }}


        if (isPrime) {
            System.out.println(number + " sadə ədədidir.");
        } else {
            System.out.println(number + " sadə ədəd deyil.");
        }

            // TASK 4) Verilmiş sözün palindrom olub-olmadığını yoxla
        String word = "довод";
        StringBuilder sb = new StringBuilder(word);
        sb.reverse();
        String wordSb = sb.toString();
        System.out.println(wordSb.equals(word)); // true
        System.out.println(sb.equals(word)); // false

        // TASK 5) Verilmiş ədədin rəqəmlərini toplayan metod yaz.
        int result = sumNumber(85);
        System.out.println("Сумма цифр: " + result);

        //6) base ədədini exponent dərəcəsinə
        int result1 = baseNumber(2);
        System.out.println(" exponent " + result1);
//task 7
int result7=reverseNumber(2587);
        System.out.println( result7);

        //task 8
        int result8=searchNumber(2587);
        System.out.println( result8);

        //9) base ədədini exponent dərəcəsinə
        int result9 = armStrong(125);
        System.out.println(" exponent " + result9);

    }
    // task 5) Verilmiş ədədin rəqəmlərini toplayan metod yaz.
    public static int sumNumber(int number) {
        int sum=0;
        while(number>0){
            sum=sum+number%10;
            number=number/10;
        }
    return sum;
    }

    //6) base ədədini exponent dərəcəsinə
    // yüksəldən öz metodunu yaz (Math.pow istifadə etmədən).
    public static int baseNumber (int exponent) {
        int base=8;
        int total=1;
        for (int i = 0; i <exponent ; i++) {
            total*=base;

        }
        return total;
    }
    // 7) Verilmiş ədədi tərsinə çevirən metod yaz.
    public static int reverseNumber (int number) {
      String x=String.valueOf(number);
      StringBuilder sb= new StringBuilder(x);
      StringBuilder svReverse=sb.reverse();
      String xb=svReverse.toString();
      Integer xNumber = Integer.valueOf(xb);
      int ab=xNumber;
      return  ab;

    }
    // task 8) Verilmiş ədədin neçə rəqəmdən ibarət olduğunu
    // hesablayan metod yaz.
    public static int searchNumber (int number) {
        String x=String.valueOf(number);
        int yt=x.length();
        return yt;

    }
    //9) Verilmiş ədədin Armstrong ədədi olub-olmadığını yoxlayan
    // metod yaz. (Armstrong ədədi — rəqəmlərinin,
    // rəqəm sayı qədər dərəcəyə yüksəldilmiş cəmi,
    // ədədin özünə bərabər olur.)
    public static int armStrong(int number) {
        int digitsCount = String.valueOf(number).length();
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            int total = 1;
            for (int i = 0; i < digitsCount; i++) {
                total *= digit;
            }
            sum += total;
            number /= 10;
        }
        return sum ;
    }
}