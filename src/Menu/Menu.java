package Menu;

import java.util.ArrayList;

public class Menu
{
    ArrayList<Item> listOfItems;

    public Menu() {}
    public void addItem(Item item){}
    public void removeItem(Item item){}
    public void changeItemName(Item item,String name){}
    public void changeItemType(Item item,String type){}
    public void changeItemIngredients(Item item,String ingredients){}
    public void changeItemStandardPrice(Item item,double standardPrice){}
    public boolean isItOnTheMenu(Item item){return false;}


}
