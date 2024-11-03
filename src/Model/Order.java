package Model;

import java.util.Date;

public class Order {
    private long orderId;
    private Date date;
    private Menu menu;
    private int soLuong;
    public Order(){}
    public Order(long orderId, Date date, Menu menu, int soLuong) {
        this.orderId = orderId;
        this.date = date;
        this.menu = menu;
        this.soLuong = soLuong;
    }

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
}
