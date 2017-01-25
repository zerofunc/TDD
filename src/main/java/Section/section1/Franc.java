package Section.section1;

/**
 * Created by YooHyeongJu on 2017-01-25.
 */
public class Franc extends Money{
    public Franc(int amount) {
        this.amount = amount;
    }

    public Money times(int multiplier) {
        return new Franc(amount * multiplier);
    }

    @Override
    public int hashCode() {
        return amount;
    }
}
