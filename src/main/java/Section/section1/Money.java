package Section.section1;

/**
 * Created by YooHyeongJu on 2017-01-25.
 */
public class Money {
    protected int amount;

    @Override
    public boolean equals(Object o) {
        Money money = (Money) o;
        return amount == money.amount && getClass().equals(money.getClass());
    }
}
