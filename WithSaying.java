package designpat.bakery;

public class WithSaying extends CakeDecorator{
    private int CAKE_COST;
    private String description;

    public WithSaying(Cake cake, String saying) {
        super(cake);
        this.CAKE_COST=cake.getCost();
        this.description=cake.getDescription()+" with saying \""+saying+"\"";
    }

    @Override
    public String getDescription() {
        return description;
    }

    public int getCost(){
        return CAKE_COST;
    }
   

   

    
    
}
