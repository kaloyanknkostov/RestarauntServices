package designpat.bakery;

public class Sprinkles extends CakeDecorator{
    private int CAKE_COST;
    private String description;

    public Sprinkles(Cake cake) {
        super(cake);
        this.CAKE_COST=cake.getCost()+2;
        this.description=cake.getDescription()+" with sprinkles";
    }

    @Override
    public String getDescription() {
        return description;
    }

    public int getCost(){
        return CAKE_COST;
    }
   

   

    
    
}

