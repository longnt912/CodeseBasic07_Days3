import java.util.Scanner;

public class Dientichhinhtron {
    public static double tinhDienTich(double r) {
        return r * r * 3.14;
    }

    public static void main(String[] args) {
        double r;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao ban kinh hinh tron: ");
        r = sc.nextDouble();
        System.out.println("Dien tich hinh tron la: " + tinhDienTich(r));
    }

}
