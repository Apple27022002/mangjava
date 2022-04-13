package SinhVien;

public class SinhVien  {
    private int MaHocSinh;
    private String TenHocSinh;
    private int TuoiHocSinh;
    SinhVien(){}
    public SinhVien(int maHocSinh, String tenHocSinh, int tuoiHocSinh) {
        MaHocSinh = maHocSinh;
        TenHocSinh = tenHocSinh;
        TuoiHocSinh = tuoiHocSinh;
    }

    public int getMaHocSinh() {
        return MaHocSinh;
    }

    public void setMaHocSinh(int maHocSinh) {
        MaHocSinh = maHocSinh;
    }

    public String getTenHocSinh() {
        return TenHocSinh;
    }

    public void setTenHocSinh(String tenHocSinh) {
        TenHocSinh = tenHocSinh;
    }

    public int getTuoiHocSinh() {
        return TuoiHocSinh;
    }

    public void setTuoiHocSinh(int tuoiHocSinh) {
        TuoiHocSinh = tuoiHocSinh;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "MaHocSinh=" + MaHocSinh +
                ", TenHocSinh='" + TenHocSinh + '\'' +
                ", TuoiHocSinh=" + TuoiHocSinh +
                '}';
    }
}
