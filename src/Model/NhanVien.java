package Model;

public class NhanVien {
    private long id;
    private String ten;
    private float luongmotgio;
    private int sogiolam;
    public NhanVien() {}
    public NhanVien(long id, String ten, float luongmotgio, int sogiolam) {
        this.id = id;
        this.ten = ten;
        this.luongmotgio = luongmotgio;
        this.sogiolam = sogiolam;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public float getLuongmotgio() {
        return luongmotgio;
    }

    public void setLuongmotgio(float luongmotgio) {
        this.luongmotgio = luongmotgio;
    }

    public int getSogiolam() {
        return sogiolam;
    }

    public void setSogiolam(int sogiolam) {
        this.sogiolam = sogiolam;
    }
    public float tongluong(){
        return luongmotgio*sogiolam;
    }
}
