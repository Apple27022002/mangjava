import java.util.Scanner;

public class TongMang2Chieu {
    public static void main(String[] args) {
        int soCot, soDong;
        int b = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so cot");
        soCot = scanner.nextInt();
        System.out.println("Nhap so dong");
        soDong = scanner.nextInt();
        int a[][] = new int[soDong][soCot];
        for (int i = 0; i < soDong; i++) {
            for (int e = 0; e < soCot; e++) {
                System.out.println(" Nhap vao gia tri cua phan tu thu " + i + " va o cot so " + e);
                a[i][e] = scanner.nextInt();
            }

        }
        for (int r = 0; r < soDong; r++) {
            for (int m = 0; m < soCot; m++) {
                b += a[r][m];

            }
        }
        System.out.println("tong cua mang la"+b);
    }
}
