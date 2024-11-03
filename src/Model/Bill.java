package Model;

public class Bill {
    private int billid;
    private Order order;
    private Menu menu;
   public Bill(){};

    public Bill(int billid, Order order, Menu menu) {
        this.billid = billid;
        this.order = order;
        this.menu = menu;
    }

    public int getBillid() {
        return billid;
    }

    public void setBillid(int billid) {
        this.billid = billid;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public double Thanhtien(){
        return (getMenu().getDonGia()*getOrder().getSoLuong());
    }
}
