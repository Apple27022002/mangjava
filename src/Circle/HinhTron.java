package Circle;

public class HinhTron {
    public double BanKinh;
    public String color;
    public HinhTron(){

    }

    public HinhTron(double banKinh, String color) {
        BanKinh = banKinh;
        this.color = color;
    }

    public double getBanKinh() {
        return BanKinh;
    }

    public void setBanKinh(double banKinh) {
        BanKinh = banKinh;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
 public float[] getXỴ̣̣̣̣ () {
        return new float[]{};

 }
 public  void setXY(float x ) {

 }
    @Override
    public String toString() {
        return "HinhTron{" +
                "BanKinh=" + BanKinh +
                ", color='" + color + '\'' +
                '}';
    }
}
