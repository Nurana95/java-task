import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
2) Arrayin bütün elementlərinin cəmini və ədədi ortasını tap.
3) Arrayin neçə cüt, neçə tək elementi olduğunu tap.
4) Arrayin ən böyük və ən kiçik elementini tap.
5) Arrayin elementlərini sondan əvvələ doğru çap et.
6) İstifadəçi bir ədəd daxil edir. Bu ədəd arraydadırsa indeksini, yoxdursa "Tapılmadı" yaz.
7) Matrisin əsas diaqonalındakı elementləri çap et
8) Matrisin köməkçi diaqonalındakı elementləri çap et
9)
*
**
***
****
*****. For ile bu patterni cekin
         */

//    task 1) 10 ölçülü array yarat, elementlərini ekrana çap et.


        int[] arr = new int[10];
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int arrInt : arr) {
            System.out.println(arrInt);//0 0 0 0 0 0 0 0 0
        }
        for (int arrInt1 : arr1) {
            System.out.println(arrInt1);
        }
        // task 2 2) Arrayin bütün elementlərinin cəmini və ədədi ortasını tap.
        int[] arrSum = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int total : arrSum) {
            sum += total;}
        int average=sum/arrSum.length;
        System.out.println("sum:" + sum);
        System.out.println("average:" + average);


        //task3 3) Arrayin neçə cüt, neçə tək elementi olduğunu tap.

        int[] evenOdd = {1, 2, 3, 4, 5, 22, 55, 84, 70, 53};

        for (int number : evenOdd) {
            if (number % 2 != 0) {
                System.out.println("odd:" + number);
            } else if (number % 2 == 0) {
                System.out.println("even:" + number);
            }
        }

        //task 4) Arrayin ən böyük və ən kiçik elementini tap.
        int[] largestSmalest = {22, 55, 84, 70, 45};

        int max = largestSmalest[0];
        int min = largestSmalest[0];
        for (int i = 1; i < largestSmalest.length; i++) {
            if (largestSmalest[i] > max) max = largestSmalest[i];
            if (largestSmalest[i] < min) min = largestSmalest[i];
        }
        System.out.println("Ən böyük: " + max + ", Ən kiçik: " + min);


//task 5 5) Arrayin elementlərini sondan əvvələ doğru çap et.
        int[]  array= {22, 55, 84, 70, 53};

            for (int j = array.length-1; j>= 0 ; j--) {
                System.out.println(array[j]);}


            //task 6) İstifadəçi bir ədəd daxil edir.
        // Bu ədəd arraydadırsa indeksini, yoxdursa "Tapılmadı" yaz.
        Scanner scanner=new Scanner(System.in);
        System.out.println("input number");
    int counter=scanner.nextInt();
        int[]  arraySearch= {22, 55, 84, 70, 53};
boolean found=false;
        for (int i = 0; i < arraySearch.length; i++) {
if (counter==arraySearch[i]){
    System.out.println("tapildi"+arraySearch[i]);
    found=true;
    break;
}

        }if (!found){
            System.out.println("tapilmadi");
        }


        // task 7  Matrisin əsas diaqonalındakı elementləri çap et
        // task 8) Matrisin köməkçi diaqonalındakı elementləri çap et
        int[][] matrixArr={
                {1,2,3},
                {4,5,6},
                {5,8,78}};
        for (int i = 0; i < matrixArr.length; i++) {

            for (int j = 0; j < matrixArr[i].length; j++) {
                System.out.println(matrixArr[j][j]);

            }

        }
//task9


String star=" ";
        for (int i = 0; i < 5; i++) {
            star+="* ";
            System.out.println(star);


        }







    }}