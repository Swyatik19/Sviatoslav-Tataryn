package homeWork11;

import homeWork11.coffeeOrderBoard.CoffeeOrderBoard;
import homeWork11.coffeeOrderBoard.Order;

public class Main {
    public static void main(String[] args) {
        Order user1 = new Order("john", 1);
        Order user2 = new Order("jeison", 2);
        Order user3 = new Order("monyka", 3);
        Order user4 = new Order("liza", 4);
        Order user5 = new Order("dmitro", 5);
        Order user6 = new Order("Alex", 6);
        Order user7 = new Order("ela", 7);
        Order user8 = new Order("nina", 8);
        Order user9 = new Order("bob", 9);
        Order user10 = new Order("santa", 10);
        Order user11 = new Order("joch", 11);

        CoffeeOrderBoard orderBoard = new CoffeeOrderBoard();
        orderBoard.add(user1);
        orderBoard.add(user2);
        orderBoard.add(user3);
        orderBoard.add(user4);
        orderBoard.add(user5);
        orderBoard.add(user6);
        orderBoard.add(user7);

        orderBoard.draw();
        orderBoard.deliver(orderBoard.list, user1.getIdOrdering());
        orderBoard.draw();
        orderBoard.deliver(orderBoard.list, user5.getIdOrdering());
        orderBoard.draw();
    }
}
