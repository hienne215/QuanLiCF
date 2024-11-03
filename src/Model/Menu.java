package Model;

public class Menu {
    private int idCaffe;
    private String loaiCafes;
    private double donGia;
    private String loaiDoUong;
    public Menu() {}
    public Menu(int idCaffe, String loaiCafes, String loaiDoUong, double donGia) {
        this.loaiCafes = loaiCafes;
        this.donGia = donGia;
        this.loaiDoUong = loaiDoUong;
        this.idCaffe = idCaffe;
    }

    public int getIdCaffe() {
        return idCaffe;
    }

    public void setIdCaffe(int idCaffe) {
        this.idCaffe = idCaffe;
    }

    public String getLoaiCafes() {
        return loaiCafes;
    }

    public void setLoaiCafes(String loaiCafes) {
        this.loaiCafes = loaiCafes;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public String getLoaiDoUong() {
        return loaiDoUong;
    }

    public void setLoaiDoUong(String loaiDoUong) {
        this.loaiDoUong = loaiDoUong;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "IdCaffe=" + idCaffe +
                ", LoaiCafe='" + loaiCafes + '\'' +
                ", Gia=" + donGia +
                ", LoaiDoUong='" + loaiDoUong + '\'' +
                '}';
    }
}
