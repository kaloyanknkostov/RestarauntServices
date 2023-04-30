package designpat.telephone;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * Store a phone number, digit-by-digit
 */
public class PhoneModel{
    private List<Integer> digits = new ArrayList<>();
    private ArrayList<Observer> listOfObservers = new ArrayList<>();
    
    public void addDigit(int newDigit) {
        digits.add(newDigit);
        listOfObservers.get(0).notificationNewDigit(newDigit);
        if(getDigits().size()==10){
            listOfObservers.get(1).notificationNewDigit(newDigit);
        }
    }

    public void addObserver(Observer observer){
        listOfObservers.add(observer);

    }

    public List<Integer> getDigits() {
        return digits;
    }



}
