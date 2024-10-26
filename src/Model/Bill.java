package Model;

public class Bill {
    private int Billid;
    private Order order;
    private Menu menu;

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public int getBillid() {
        return Billid;
    }

    public void setBillid(int billid) {
        Billid = billid;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Bill() {
    }

    public Bill(int Billid, Order order, Menu menu) {
        this.Billid = Billid;
        this.order = order;
        this.menu = menu;
    }
    public double Thanhtien(){
        return (getMenu().getGia()*getOrder().getSoluong());
    }
}
