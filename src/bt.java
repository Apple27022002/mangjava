import java.util.Scanner;

public class bt {
    public static void main(String[] args) {
//        int a[][] = {
//        {1, 2, 3} ,
//        {4, 5, 6} ,
//        {7, 8, 9} ,
//    };
        int soDong, soCot;

        Scanner scanner=new Scanner(System.in);

        System.out.println("Nhập vào số dòng của mảng: ");
        soDong = scanner.nextInt();
        System.out.println("Nhập vào số cột của mảng: ");
        soCot = scanner.nextInt();
        int[][] A = new int[soDong][soCot];


        for (int i = 0; i < soDong; i++) {
            for (int j = 0; j < soCot; j++) {
                System.out.print("Nhập phần tử thứ [" + i + ", " + j + "]: ");
                A[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Mảng vừa nhập: ");
        for (int i = 0; i < soDong; i++) {
            for (int j = 0; j < soCot; j++) {
                System.out.print(A[i][j] + "\t");
            }
            System.out.println("\n");
        }



    }
}
