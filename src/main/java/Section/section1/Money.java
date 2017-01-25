package Section.section1;

/**
 * Created by YooHyeongJu on 2017-01-25.
 */
public abstract class Money {
    protected int amount;

    public abstract Money times(int multiplier);

    @Override
    public boolean equals(Object o) {
        Money money = (Money) o;
        return amount == money.amount && getClass().equals(money.getClass());
    }

    public static Money dollar(int amount) {
        return new Dollar(amount);
    }

    public static Money franc(int amount) {
        return new Franc(amount);
    }
}
