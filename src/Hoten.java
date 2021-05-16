import java.util.Scanner;

public class Hoten {
        public static void main(String[] args) {
            double n;
            Scanner obj = new Scanner(System.in);
            do {
                System.out.print("Nhập vào một số: ");
                n = obj.nextDouble();
            } while (n < 0 || n > 100);
        }

        public static void readNumber() {

        }
    }
