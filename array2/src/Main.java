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
        arr1[0]=index1;
        arr1[1]=index;



        //task  3) Array-dən yalnız cüt ədədləri saxla, tək ədədləri sil.
int[] arr3={22,2,5,78};
        StringBuilder sb1 = new StringBuilder();

        for (int i = 0; i < arr3.length; i++) {
if (arr3[i]%2==0){
    sb1.append(arr3[i]).append(" ");
}
        }
        String result = sb1.toString();
        System.out.println(result);


        /* 4) Array-də təkrarlanan elementləri tap və sil, hər element
yalnız bir dəfə qalsın.
         */
        int[] arr4={22,2,6,6,5,5,85,78};
        int ab=arr4[0];
        StringBuilder sb5 = new StringBuilder();

        for (int i = 0; i < arr4.length ; i++) {
            boolean duplicate = false;

            for (int j = 0; j < i; j++) {
            if (arr4[i]==arr4[j]){
                duplicate = true;
                break;

            }}
            if (!duplicate) {
                sb5.append(arr4[i]).append(" ");
            }

        }

        System.out.println(sb5);

        //5) Array içindəki ikinci ən böyük və ikinci ən kiçik ədədi ta

        int[] arr5 = {22, 2, 5, 78, 3, 31};
int[] arr6;
        int max = arr5[0];
        int max1 = arr5[0];
        int min1 = arr5[0];
        int min = arr5[0];

        for (int i = 1; i < arr5.length; i++) {
            if (arr5[i] > max) max = arr5[i];
            if (arr5[i] < min) min = arr5[i];
            if (arr5[i] > max1 && arr5[i]!=max) max1 = arr5[i];
            if (arr5[i] < min1 && arr5[i]!=min) min1 = arr5[i];

        }

        System.out.println("max 2= " + max1);
        System.out.println("min 2 = " + min1);



    }
}











