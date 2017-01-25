package Section.section1;

/**
 * Created by YooHyeongJu on 2017-01-16.
 */
public class Dollar extends Money{
    public Dollar(int amount) {
        this.amount = amount;
    }

    public Money times(int multiplier) {
        return new Dollar(amount * multiplier);
    }

    @Override
    public int hashCode() {
        return amount;
    }
}
