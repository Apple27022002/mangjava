package Drive;

public class QuanLyXeMay implements QuanLy<XeMay> {
    private XeMay[] danhSach = new XeMay[20];
    private int size = 0;

    @Override
    public void them(XeMay xeMay) {
        danhSach[size] = xeMay;
        size++;
    }

    @Override
    public void sua(String name, XeMay xeMay) {
        danhSach[timKiem(name)]= xeMay;
    }

    @Override
    public void Xoa(String name) {

    }

    @Override
    public int timKiem(String name) {
        for (int k = 0; k < size; k++) {
            if (name == danhSach[k].getTenXe()) {
                return k;
            }

        }
        return 0;
    }

    @Override
    public void xapXep() {
    }

    @Override
    public void inRa() {
        for (int i = 0; i < size; i++) {
            System.out.println(danhSach[i]);
        }
    }

    public static void main(String[] args) {
        QuanLyXeMay ql =new QuanLyXeMay();
        XeMay xm1 =new XeMay("Audi ","Darkgreen","R29",9.8,8.0);
        XeMay xm2 =new XeMay("Audi ","green","R295",9.809,38.0);
        XeMay xm3 =new XeMay("Audi ","Dark","R22",99.8,89.0);
        XeMay xm4 =new XeMay("Audi ","Blue","R23",97.8,87.0);
        ql.them(xm1);
        ql.them(xm2);
        ql.them(xm3);
        ql.them(xm4);
        ql.inRa();
        XeMay xm5 =new XeMay("Audi ","Blue","R43",97.8,87.0);
        ql.sua("R29",xm5);
        ql.inRa();
    }
}







