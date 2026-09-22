import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


// I task  1-dən 100-ə qədər olan ədədlərin cəmini tapan proqram yazın.
        int total=0;
        for (int evenNumber = 1;evenNumber<= 100; evenNumber++){
            total+=evenNumber;
            System.out.println(evenNumber);

        }
        System.out.println(total);





//task 2
        int count = 1;
        while (count <= 50){
            count++;
            if(count%2==0) {
                System.out.println(count);

            }}
/*
task 3) do-while dövrü ilə istifadəçidən "çıxmaq" istəyənə qədər ədəd daxil
etməsini tələb edən və daxil olunan bütün ədədlərin
ortalamasını hesablayan proqram yazın.
 */


        Scanner scanner=new Scanner(System.in);
        int  counter;
        int sum=0;
        do {
            System.out.println("Input a number");
            counter=scanner.nextInt();
            if (counter==404){
                break;
            }
            sum+=counter;
        } while (true);

        System.out.println("number sum:"+sum);







        // task 4 "Salam" sözünü 5 dəfə çap edin (for dövrü ilə).
        for (int i = 1; i < 6; i++) {
            String hi = "Salam";
            System.out.println(hi);
        }


// task 5) 10-dan 1-ə qədər olan ədədləri əks ardıcıllıqla çap edin.
        for (int i =10 ; i>0 ; i--) {
            System.out.println(i);

        }

//task 6) 6) İstifadəçidən bir ədəd daxil
// edilsin və o ədədə qədər olan bütün
// ədədlər çap olunsun (məsələn, 7 daxil edilsə: 1 2 3 4 5 6 7).




        Scanner scanner1=new Scanner(System.in);
        System.out.println("input number");
        int number=scanner1.nextInt();
        for (int i=1; i<= number; i++) {
            System.out.println(i);
        }

//task 7) 7) İstifadəçidən daxil edilən bir ədədin faktorialını (n!) hesablayın.

        Scanner scanner3=new Scanner(System.in);
        System.out.println("input number");
        int number1=scanner3.nextInt();
        int numberFactorial=1;

        for (int i=1; i<= number1; i++) {
            numberFactorial*=i;
            System.out.println("!n="+numberFactorial);
        }


//task 3

    }
}
