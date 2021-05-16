import java.util.Scanner;

public class Timmang {
    public static void main(String[] args) {
        int arr[] = { 0, 0, 15, 0, 28, 8, 7, 90};
        int a = 0;
        Timmang(arr, a);
    }
        public static void Timmang(int arr[], int a)
        {
            int n = arr.length;
            int first = -1, last = -1;
            for (int i = 0; i < n; i++) {
                if (a != arr[i])
                    continue;
                if (first == -1)
                    first = i;
                last = i;
            }
            if (first != -1) {
                System.out.println("Vi tri dau tien = " + first);
                System.out.println("Vi tri cuoi cung = " + last);
            }
            else
                System.out.println("Khong tim duoc");
        }

    }



