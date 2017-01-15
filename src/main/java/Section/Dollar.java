package Section;

/**
 * Created by YooHyeongJu on 2017-01-16.
 */
public class Dollar {
    int amount;
    public Dollar(int amount) {
        this.amount = amount;
    }

    public void times(int multiplier) {
        amount *= multiplier;
    }
}
