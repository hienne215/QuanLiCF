package Model;

public class Menu {
    private String menuten;
    private long menuid;
    private double gia;
    private String loai;
    public Menu(){}
    public Menu(String ten, long id, double gia, String loai){
        this.menuten = menuten;
        this.menuid = menuid;
        this.gia = gia;
        this.loai = loai;
    }

    public String getTen() {
        return menuten;
    }

    public void setTen(String ten) {
        this.menuten = menuten;
    }

    public long getId() {
        return menuid;
    }

    public void setId(long id) {
        this.menuid = id;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }
}
