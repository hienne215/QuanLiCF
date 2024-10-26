package Model;

public class KhachHang {
    private long kh_id;
    private String kh_name;
    public KhachHang() {}
    public KhachHang(long kh_id, String kh_name) {
        this.kh_id = kh_id;
        this.kh_name = kh_name;
    }

    public long getKh_id() {
        return kh_id;
    }

    public void setKh_id(long kh_id) {
        this.kh_id = kh_id;
    }

    public String getKh_name() {
        return kh_name;
    }

    public void setKh_name(String kh_name) {
        this.kh_name = kh_name;
    }

}
