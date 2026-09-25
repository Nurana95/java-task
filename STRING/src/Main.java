import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
       1) Integer a = 127, b = 127; və Integer c = 128, d = 128;
       üçün == və equals() ilə müqayisə et. Nəticələr niyə fərqlidir?

2) String inputun polindrome olub olmamasini yoxlayin.

3) Sətri tərsinə çevir ("hello" → "olleh")

4) Anagram yoxlaması ("listen" və "silent")

5) Sözlərin sırasını tərsinə çevir ("I love Java" → "Java love I")

6) Təkrarlanan simvolları tap və say ("programming" → r=2, g=2, m=2)

7) Hər sözün ilk hərfini böyük et ("salam dunya" → "Salam Dunya")

8) Rəqəm yoxlaması alqoritmi(Daxil edilen inputun reqem olub olmamasinin yoxlanmasi)
         */

//TASK        1) Integer a = 127, b = 127; və Integer c = 128,
// d = 128; üçün == və equals() ilə müqayisə et. Nəticələr niyə fərqlidir?

 Integer a=127;
Integer b=127;
        Integer c=258;
        Integer d=258;

System.out.println(a==b);
System.out.println(a.equals(b));

System.out.println(c.equals(d));
        System.out.println((c==d)+" c==d false");

//2) String inputun polindrome olub olmamasini yoxlayin.

String input="шалаш";
String input1="шалаш";
        System.out.println(input==input1);
        System.out.println(input.equals(input1));

// task 3 Sətri tərsinə çevir ("hello" → "olleh")
        String hi="hello";
        String empty="";
        char[] charArr = hi.toCharArray();
        for (int i = charArr.length-1; i >=0; i--) {
            empty= empty + charArr[i];
            System.out.print(charArr[i]);
        }
        System.out.println(empty);



        //task 4  Anagram yoxlaması ("listen" və "silent")
        String input2="listen";
        String input3="silent";
        System.out.println(input2==input3);
        System.out.println(input2.equals(input3));
          //task 5  5) Sözlərin sırasını tərsinə çevir ("I love Java" → "Java love I")
String words="i love java ";
String part1=words.substring(0,1);
String part2=words.substring(2,7);
String part3=words.substring(7,12);
            System.out.println(part3+part2+part1);

        //task 6 6) Təkrarlanan simvolları tap və say ("programming" → r=2, g=2, m=2)
String words3="programming";

        char[] arr = words3.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
            if (arr[i]==arr[j]){
                System.out.println(arr[i]);
            }
            }}

            //task 7) Hər sözün ilk hərfini böyük et ("salam dunya" → "Salam Dunya")
            String hello = "salam dunya";
            String  word1= hello.substring(0, 1).toUpperCase() + hello.substring(1,6);
            String  word2= hello.substring(6, 7).toUpperCase() + hello.substring(7);
            System.out.println(word1+word2);



//8) Rəqəm yoxlaması alqoritmi(Daxil edilen inputun reqem olub olmamasinin yoxlanmasi)
        Scanner scanner=new Scanner(System.in);
        System.out.println("input number");
        String number=scanner.next();
        String number1="1 2 3 4 5 6 7 8 9 0";
        char[] arr5 = number.toCharArray();
        char[] arrNumber = number1.toCharArray();
boolean found=false;
        for (int i = 0; i < arr5.length; i++) {
            for (int j = 0; j < arrNumber.length; j++) {
                if (arr5[i]==arrNumber[j]){
                    found=true;
                    System.out.println("reqemdi");
                    break;

                }

            }
        }

if (!found){
    System.out.println("reqem yaz");

}
    }}