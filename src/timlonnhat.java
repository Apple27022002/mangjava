import javafx.scene.transform.Scale;

import java.util.Scanner;

public class timlonnhat {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a[];
        int b;
        System.out.println("nhap vao chieu dai mang");
        b =scanner.nextInt();
        a=new int[b];
        for (int i=0 ;i<b;i++){
            System.out.println("nhao vao gia tri thu"+(i+1));
            a[i]= scanner.nextInt();
        }
        int max=a[0];
        for (int c=0;c<a.length;c++){
            if (a[c]>max){
                max =a[c];
                System.out.println("ket qua lon nhat la "+max);
            }

        }

    }
}
