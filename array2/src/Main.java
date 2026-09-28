import java.util.Scanner;

public class Main{
    public static void main(String[] args) {


    /*
    Ev tapsiriqi:

1) Verilmiş array-i artan (ascending) və azalan
(descending) qaydada sırala

2) İki indeksdəki elementlərin yerini dəyişilməsi(Swap):
İstifadəçidən 2 indeks al və həmin indekslərdəki qiymətlərin yerini dəyiş.

3) Array-dən yalnız cüt ədədləri saxla, tək ədədləri sil.

4) Array-də təkrarlanan elementləri tap və sil, hər element
yalnız bir dəfə qalsın.

5) Array içindəki ikinci ən böyük və ikinci ən kiçik ədədi tap.
     */

//) task 1) Verilmiş array-i artan (ascending) və azalan
//(descending) qaydada sırala

        // task 1
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

        System.out.print("Artan sıra: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
//task 2
        int[] arr1 = {5, 2, 9, 1, 7, 6};
        Scanner scanner = new Scanner(System.in);
        System.out.println("input number");
        int index = scanner.nextInt();

        System.out.print("input number");
        int index1 = scanner.nextInt();
        int index2=arr[index];

        System.out.println(index2);


        //task  3) Array-dən yalnız cüt ədədləri saxla, tək ədədləri sil.
int[] arr3={22,2,5,78};
        for (int i = 0; i < arr3.length; i++) {
if (arr3[i]%2==0){
    int arrEven=arr3[i];
}
        }


        /* 4) Array-də təkrarlanan elementləri tap və sil, hər element
yalnız bir dəfə qalsın.
         */
        int[] arr4={22,2,6,6,5,5,85,78};
        StringBuilder sb = new StringBuilder();
boolean x=true;
int bc;
        for (int i = 0; i < arr4.length ; i++) {
            for (int j = 0; j < i; j++) {
            if (arr4[i]==arr4[j]){
            }else {
                System.out.println(arr4[i]);

            }

            }
        }


        //5) Array içindəki ikinci ən böyük və ikinci ən kiçik ədədi tap.
        int[] arr5={22,2,6,6,5,5,85,78};
        for (int i = 0; i < arr5.length; i++) {
            for (int j = 0; j < i; j++) {

            if (arr5[i]>arr[0]) {
                System.out.println(arr5[i] + "dd");

            }            }
        }


    }}











