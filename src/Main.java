public class Main {

    public static void main(String[] args) {
        Order order = new Order();
        order.attach(new PriceObserver());
        order.attach(new QuantityObserver());

        order.addItem(new Item("Item 1", 55));
        System.out.println(order);

        order.addItem(new Item("Item 2", 80));
        System.out.println(order);

        order.addItem(new Item("Item 3", 40));
        System.out.println(order);

        order.addItem(new Item("Item 4", 10));
        order.addItem(new Item("Item 5", 50));
        order.addItem(new Item("Item 6", 40));
        System.out.println(order);
    }
}