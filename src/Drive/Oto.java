package Drive;

public class Oto extends PhuongTien{
    private int soCHo;
    public Oto(){}

    public Oto(int soCHo) {
        this.soCHo = soCHo;
    }

    public Oto(String hangXe, String mauXe, String tenXe, double giaXe, int soCHo) {
        super(hangXe, mauXe, tenXe, giaXe);
        this.soCHo = soCHo;
    }

    public int getSoCHo() {
        return soCHo;
    }

    public void setSoCHo(int soCHo) {
        this.soCHo = soCHo;
    }
}
