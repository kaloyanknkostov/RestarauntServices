package designpat.bakery;

/**
 * Cake bake class.
 */
public abstract class Cake {
    private int CAKE_COST = 10;

    public int getCost() {
        if(this.getDescription().equals("Strawberry cake")){
            CAKE_COST=CAKE_COST*2;
        }
        return CAKE_COST;
    }

    public abstract String getDescription();
}
