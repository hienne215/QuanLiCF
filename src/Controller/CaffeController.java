package Controller;

import View.CaffeView;
import Model.NhanVien;

import Model.Bill;
import Model.Menu;
import Model.KhachHang;

import java.util.ArrayList;
import java.util.List;

public class  CaffeController {
    private List<Menu> loaiCafes;
    private List<KhachHang> khachHangs;
    private List<NhanVien> nhanViens;
    private List<Bill> donHangs;
    private CaffeView view;

    public CaffeController(CaffeView view) {
        this.view = view;
        this.loaiCafes = new ArrayList<>();
        this.khachHangs = new ArrayList<>();
        this.nhanViens = new ArrayList<>();
        this.donHangs = new ArrayList<>();
    }

    public void addCafeItem(Menu loaiCafe) {
        loaiCafes.add(loaiCafe);
        view.hienThiThongBaoThemDoUong(loaiCafe);
    }

    public void addCustomer(KhachHang khachHang) {
        khachHangs.add(khachHang);
        view.hienThiThongBaoThemKhachHang(khachHang);
    }

    public void addEmployee(NhanVien nhanVien) {
        nhanViens.add(nhanVien);
        view.hienThiThongBaoThemNhanVien(nhanVien);
    }

    public void placeOrder(String maKhachHang, String IdCafe) {
        view.hienThiThongBaoDatDoUong(IdCafe, maKhachHang);
    }

    public void completeOrder(String maDonHang) {
        view.hienThiThongBaoHoanTatDon(maDonHang, "Hoàn thành");
    }
}
