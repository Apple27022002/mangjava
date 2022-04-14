package Drive;

public class XeMay extends PhuongTien {
    private double dungTich;

    public XeMay() {
    }

    public XeMay(double dungTich) {
        this.dungTich = dungTich;
    }

    public XeMay(String hangXe, String mauXe, String tenXe, double giaXe, double dungTich) {
        super(hangXe, mauXe, tenXe, giaXe);
        this.dungTich = dungTich;
    }

    public double getDungTich() {
        return dungTich;
    }

    public void setDungTich(double dungTich) {
        this.dungTich = dungTich;
    }

    @Override
    public String toString() {
        return "XeMay{" + "name " + getTenXe() +
                "mau Xe la "+getMauXe()+
                "gia xe " + getGiaXe() +
                "dungTich= " + dungTich +
                '}';
    }
}
