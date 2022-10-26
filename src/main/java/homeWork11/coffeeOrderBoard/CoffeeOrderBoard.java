package homeWork11.coffeeOrderBoard;

import java.util.LinkedList;
import java.util.List;

public class CoffeeOrderBoard {
    public List<Order> list = new LinkedList<>();

    public void add(Order order) {

        list.add(new Order(order.getName(), order.getIdOrdering()));
    }

    public Object deliver(List list, int queueNumber) {
        return list.remove(queueNumber);
    }

    public void draw() {
        System.out.println("=============" + System.lineSeparator() +
                "Num |  Name" + list.toString() + System.lineSeparator());
    }

}
