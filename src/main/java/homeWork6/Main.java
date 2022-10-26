package homeWork6;

public class Main {
    static Employee firstEmployee = new Employee("Ykrainets", "Ivan", "Valeriovych", "developer", "Vanya@gmail.com", "+38098656843", 24);

    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        System.out.println(firstEmployee);
    }
}
