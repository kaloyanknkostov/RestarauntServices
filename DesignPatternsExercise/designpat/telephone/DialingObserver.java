package designpat.telephone;

public class DialingObserver implements Observer{

    private final PhoneModel model;

    public DialingObserver(PhoneModel model){
        this.model = model;
    }

    @Override
    public void notificationNewDigit(int newDigit) {
    
        System.out.print("Now dialing ");
        for (int i = 0; i < model.getDigits().size(); i++) {
            System.out.print(model.getDigits().get(i));
        }
        System.out.print("...");

    }
    
}
