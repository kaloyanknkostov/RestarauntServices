package designpat.bakery;

/**
 * Create an order and print it
 */
public class Main {
    public static void main(String[] args) {
        // Create the order
        Order order = new Order();

        // Create the cakes
        Cake cake1 = new ChocolateCake();

        Cake cake2 = new VanillaCake();
        cake2 = new WithSaying(cake2, "PLAIN!");

        Cake cake3= new VanillaCake();
        cake3 = new Sprinkles(cake3);
        cake3 = new WithSaying(cake3, "FANCY");

        Cake cake4= new StrawberryCake();
        cake4 = new MultiLayered(cake4);
        cake4 = new Sprinkles(cake4);
        cake4 = new Sprinkles(cake4);
        cake4 = new WithSaying(cake4, "One of");
        cake4 = new WithSaying(cake4, "EVERYTHING");

        // Adding all the cakes
        order.addCake(cake1);
        order.addCake(cake2);
        order.addCake(cake3);
        order.addCake(cake4);

        // Print the order
        order.printOrder();
    }
}
