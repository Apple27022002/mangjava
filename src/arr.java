import java.util.Scanner;

public class arr {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int []a;
        int b;
        System.out.println(" nhap chieu dai mang ");
        b=scanner.nextInt();
        a=new int[b];
        for (int k=0;k< a.length;k++){
            System.out.println(" nhap vao phan tu mang thu "+ (+k+1));
            a[k]=scanner.nextInt();
        }
        for (int i=0;i< (a.length/2);i++){
            int temp =a[i];
            a[i]=a[a.length-1-i];
            a[a.length-1-i]=temp;
        }
        for (int e=0;e< a.length;e++){
            System.out.println(a[e]);
        }



    }
}


