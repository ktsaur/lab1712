package pizzeria;

public class Order {
    private Client client; //клиент
    private Cook cook; //повар
    private Pizza pizza; //пицца
    private OrderStatus orderStatus; //статус заказа
    private Integer orderNumber; //номер заказа
    private String time; //дата заказа

    public Order(Client client, Cook cook, Pizza pizza, String time, Integer orderNumber, OrderStatus orderStatus) {
        this.client = client;
        this.cook = cook;
        this.pizza = pizza;
        this.time = time;
        this.orderNumber = orderNumber;
        this.orderStatus = orderStatus;
    }

    @Override
    public String toString() {
        return "Order{" +
                "client = " + client.name +
                ", cook = " + cook.name +
                ", pizza = " + pizza +
                ", time = '" + time + '\'' +
                ", orderNumber = " + orderNumber +
                ", orderStatus = " + orderStatus +
                '}';
    }
}
