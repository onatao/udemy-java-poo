package secao13.enumEx01;

import java.util.Date;

public class Order {

    private Integer id;
    private Date moment;
    private OrderStatus status;
    
    public Order() {
    }

    public Order(Integer id, Date moment, OrderStatus status) {
        this.id = id;
        this.moment = moment;
        this.status = status;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getMoment() {
        return this.moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return this.status;
    }

    public String toString() {
        return  "\nID: " + this.getId() +
                "\nDATE: " + this.getMoment() +
                "\nSTATUS " + this.getStatus();      
    }


}
