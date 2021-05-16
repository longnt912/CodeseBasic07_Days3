import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Nhapvao1so {

    static int n, hun, tens, ones;

    public static void main(String args[]) throws IOException {


        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter Number: ");
        n = Integer.parseInt(in.readLine());

        if (n == 0) {

            switch (n) {
                case 0:
                    System.out.println("Khong");
                    break;

            }
        }
        if ((n == 100)) {
            hun = n / 100;
            n = 0;

            switch (hun) {
                case 1:
                    System.out.print("Mot Tram ");
                    break;
            }
        }
        if (n > 100 || n < 0) {
            System.out.print("INVALID INPUT");
        } else {
            tens = n / 10;
            n = n % 10;
            ones = n;

            switch (tens) {

                case 1: System.out.print("Muoi ");break;
                case 2:System.out.print("Hai Muoi ");break;
                case 3:System.out.print("Ba Muoi ");break;

                case 4:System.out.print("Bon Muoi ");break;
                case 5:System.out.print("Nam Muoi ");break;
                case 6:System.out.print("Sau Muoi ");break;
                case 7:System.out.print("Bay Muoi ");break;
                case 8:System.out.print("Tam Muoi ");break;
                case 9:	System.out.print("Chin Muoi ");break;
            }
            switch (ones){

                case 1: System.out.print("Mot ");break;
                case 2:System.out.print("Hai ");break;
                case 3:System.out.print("Ba ");break;

                case 4:System.out.print("Bon ");break;
                case 5:System.out.print("Nam ");break;
                case 6:System.out.print("Sau ");break;
                case 7:System.out.print("Bay ");break;
                case 8:System.out.print("Tam ");break;
                case 9:System.out.print("Chin ");break;
            }
        }
    }
}

