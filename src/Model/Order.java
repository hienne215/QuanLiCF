package Model;

import java.util.Date;

public class Order {
    private long Orderid;
    private Date date;
    private Menu menu;
    private int Soluong;
    public Order(){}
    public Order(long orderid, Date date, Menu menu, int soluong) {
        Orderid = orderid;
        this.date = date;
        this.menu = menu;
        Soluong = soluong;
    }

    public long getOrderid() {
        return Orderid;
    }

    public void setOrderid(long orderid) {
        Orderid = orderid;
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

    public int getSoluong() {
        return Soluong;
    }

    public void setSoluong(int soluong) {
        Soluong = soluong;
    }
}
