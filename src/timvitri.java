import java.util.Scanner;

public class timvitri {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String[]hocsinh={"manh","dat","thuan","hung","hoa"};
        System.out.println("nhao vao ten can tim");
        String a =scanner.nextLine();
        for (int i=0;i<hocsinh.length;i++){
            if (hocsinh[i].equals(a)){
                System.out.println("vi tri can tim la "+(i+1));
                break;
            }

        }

    }
}
