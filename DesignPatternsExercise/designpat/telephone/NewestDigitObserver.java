package designpat.telephone;



public class NewestDigitObserver implements Observer{

    private final PhoneModel model;

    public NewestDigitObserver(PhoneModel model){
        this.model = model;
    }

    @Override
    public void notificationNewDigit(int newDigit) {
        
        System.out.println(newDigit);
        
    }
    
}
