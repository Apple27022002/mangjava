package Drive;

public class QuanLyOto implements QuanLy<Oto>{
    private Oto[] list=new Oto[20];
    private int m =0;
    @Override
    public void them(Oto oto) {
        list[m]=oto;
        m++;

    }

    @Override
    public void sua(String name, Oto oto) {
        list[timKiem(name)]=oto;

    }

    @Override
    public void Xoa(String name) {

    }

    @Override
    public int timKiem(String name) {
        for (int u=0;u<m;u++){
            if (name==list[u].getTenXe()){
                return u;
            }
        }
        return 0;
    }


    @Override
    public void xapXep() {

    }

    @Override
    public void inRa() {
        for (int y=0;y<m;y++){
            System.out.println(list[y]);
        }

    }

    public static void main(String[] args) {
        QuanLyOto al=new QuanLyOto();
        Oto ad1 =new Oto("poscher","Blue","T42",8.7,8);
        Oto ad2 =new Oto("poscher","Red","HtMax2019",1192.5,2);
        Oto ad3 =new Oto("poscher","Luc bao","Ultra morden",2000.2,4);
        al.them(ad1);
        al.them(ad2);
        al.them(ad3);
        al.inRa();
    }
}
