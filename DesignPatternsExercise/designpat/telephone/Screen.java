package designpat.telephone;

/**
 * Prints things out to the screen, when needed
 * Printing to the screen:
 * System.out.println("hello");
 */
public class Screen {
    private final PhoneModel model;

    public Screen(PhoneModel model) {
        this.model = model;
        NewestDigitObserver firstObserver = new NewestDigitObserver(model);
        DialingObserver secondObserver = new DialingObserver(model);
        model.addObserver(firstObserver);
        model.addObserver(secondObserver);


    }
}
