package designpat.bakery;

public class MultiLayered extends CakeDecorator{
    private int CAKE_COST;
    private String description;

    public MultiLayered(Cake cake) {
        super(cake);
        this.CAKE_COST=cake.getCost()+5;
        this.description="Multi-layered "+cake.getDescription();
    }

    @Override
    public String getDescription() {
        return description;
    }

    public int getCost(){
        return CAKE_COST;
    }
   

   

    
    
}
