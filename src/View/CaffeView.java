package View;
import Model.KhachHang;
import Model.NhanVien;
import Model.Menu;

public class CaffeView {
    public void hienThiThongBaoThemDoUong(Menu menu) {
        System.out.println("Đã thêm đồ uống: " + menu.getLoaiDoUong() + " vào thực đơn.");
    }

    public void hienThiThongBaoThemKhachHang(KhachHang khachHang) {
        System.out.println("Đã thêm khách hàng: " + khachHang.getKh_name());
    }

    public void hienThiThongBaoThemNhanVien(NhanVien nhanVien) {
        System.out.println("Đã thêm nhân viên: " + nhanVien.getTen());
    }

    public void hienThiThongBaoDatDoUong(String IdCafe, String maKhachHang) {
        System.out.println("Khách hàng " + maKhachHang + " đã đặt đồ uống: " + IdCafe);
    }

    public void hienThiThongBaoHoanTatDon(String maDonHang, String trangThai) {
        System.out.println("Đơn hàng " + maDonHang + " đã được " + trangThai);
    }
}
