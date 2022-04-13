import java.util.Scanner;

public class DemSinhVien {
    public static void main(String[] args) {
        int chieuDai,ar ;
        int count=0;
        int a[];
        Scanner scanner =new Scanner(System.in);
        System.out.println("Nhap so luong hoc sinh");
        chieuDai=scanner.nextInt();
        a=new int[chieuDai];
        if (chieuDai>30){
            System.out.println("khong duoc qua 30 nguoi");
        }
        for (int k=0;k<a.length;k++){
            System.out.println("nhap diem hoc sinh");
            a[k]=scanner.nextInt();

        }
        for (int m=0;m<a.length;m++){
            if (a[m]>5){
                count++;
            }
        }
        System.out.println("so hoc sinh do bai kiem tra la"+count);
    }
}
