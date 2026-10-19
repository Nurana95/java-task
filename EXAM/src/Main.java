import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //task41
        Scanner scanner = new Scanner(System.in);
        System.out.println("cut eded yaz");

        int s = scanner.nextInt();
        if (s % 2 == 0) {
            System.out.println("duzdu");
        } else {
            System.out.println("sehv di cut olmalidi");

        }
//task43
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
int max=arr1[0];
int min=arr1[0];

        for (int i = 0; i < arr1.length; i++) {
            if (max<arr1[i]) max=arr1[i];
            if (min>arr1[i]) min=arr1[i];

        }
        System.out.println("Ən böyük: " + max + ", Ən kiçik: " + min);

        //task46
        String hi="hello";
        StringBuilder s2 = new StringBuilder(hi);
        System.out.println(  s2.reverse());
//task47
        String input="level";
        String input1="level";
        System.out.println(input==input1);
        System.out.println(input.equals(input1));
//task48
        int[] arrSum = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int total : arrSum) {
            sum += total;}
        int orta=sum/arrSum.length;
        System.out.println("sum:" + sum);
        System.out.println("orta" + orta);


//task50
        int[] arr = {5, 2, 9, 1, 7, 6};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }


        for (int i = 1; i < 50; i++) {
            if (i%3==0){
                System.out.println("3 bolunur fizz "+i);
            } else if (i%5==0) {

                System.out.println("buzz "+i);

            }
            else (i%3==0 || i%5==0){
                System.out.println("buzzfizz "+i);

            }
        }

    }}