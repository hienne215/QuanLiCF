package Model;

public class NhanVien {
    private long id;
    private String ten;
    private float luongMotGio;
    private int soGioLam;
    public NhanVien() {}
    public NhanVien(long id, String ten, float luongmotgio, int sogiolam) {
        this.id = id;
        this.ten = ten;
        this.luongMotGio = luongMotGio;
        this.soGioLam = soGioLam;
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

    public float getLuongMotGio() {
        return luongMotGio;
    }

    public void setLuongMotGio(float luongMotGio) {
        this.luongMotGio = luongMotGio;
    }

    public int getSoGioLam() {
        return soGioLam;
    }

    public void setSoGioLam(int soGioLam) {
        this.soGioLam = soGioLam;
    }
    public float tongluong(){

        return luongMotGio*soGioLam;
    }
}
