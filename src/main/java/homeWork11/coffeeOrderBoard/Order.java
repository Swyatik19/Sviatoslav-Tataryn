package homeWork11.coffeeOrderBoard;

public class Order {
    private String name;
    private int idOrdering;

    public Order(String name, int queueNumber) {
        this.name = name;
        this.idOrdering = queueNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdOrdering() {
        return idOrdering - 1;
    }

    public void setIdOrdering(int idOrdering) {
        this.idOrdering = idOrdering;
    }

    @Override
    public String toString() {
        return System.lineSeparator() + idOrdering + " | " + name;
    }
}
