package Drive;

public abstract class PhuongTien {
    private String hangXe;
    private String mauXe;
    private String tenXe;
    private double giaXe;
    PhuongTien(){}

    public PhuongTien(String hangXe, String mauXe, String tenXe, double giaXe) {
        this.hangXe = hangXe;
        this.mauXe = mauXe;
        this.tenXe = tenXe;
        this.giaXe = giaXe;
    }

    public String getHangXe() {
        return hangXe;
    }

    public void setHangXe(String hangXe) {
        this.hangXe = hangXe;
    }

    public String getMauXe() {
        return mauXe;
    }

    public void setMauXe(String mauXe) {
        this.mauXe = mauXe;
    }

    public String getTenXe() {
        return tenXe;
    }

    public void setTenXe(String tenXe) {
        this.tenXe = tenXe;
    }

    public double getGiaXe() {
        return giaXe;
    }

    public void setGiaXe(double giaXe) {
        this.giaXe = giaXe;
    }

    @Override
    public String toString() {
        return "PhuongTien{" +
                "hangXe='" + hangXe + '\'' +
                ", mauXe='" + mauXe + '\'' +
                ", tenXe='" + tenXe + '\'' +
                ", giaXe=" + giaXe +
                '}';
    }
}
