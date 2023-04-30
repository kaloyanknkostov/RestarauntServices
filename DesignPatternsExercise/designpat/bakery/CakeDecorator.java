package designpat.bakery;

public abstract class CakeDecorator extends Cake{
    public Cake cake;

    public CakeDecorator(Cake cake){
        this.cake=cake;
    }
    
}
