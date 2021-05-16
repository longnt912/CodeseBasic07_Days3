
import java.util.Scanner;

public class SoDuong {
    public static void main(String[] args) {
        int size, i;
        Scanner sc = new Scanner(System.in);
        System.out.print("\nPlease Enter the PS Array size  : ");
        size = sc.nextInt();
        int[] ps_arr = new int[size];

        System.out.format("\nEnter PS Array %d elements : ", size);
        for (i = 0; i < size; i++) {
            ps_arr[i] = sc.nextInt();
        }

        PositiveElement(ps_arr, size);
    }

    public static void PositiveElement(int[] ps_arr, int size) {
        int i;
        System.out.print("\nList of Positive Numbers in PS Array : ");
        for (i = 0; i < size; i++) {
            if (ps_arr[i] >= 0) {
                System.out.printf("%d  ", ps_arr[i]);
            }
        }
    }
}