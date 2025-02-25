package VendingMachine.Currency;

public class Coin implements Currency {
    private final double value;

    public Coin(CoinDenomination denomination)
    {
        this.value = getValueForDenomination(denomination);
    }

    public double getValue()
    {
        return value;
    }

    private double getValueForDenomination(CoinDenomination denomination)
    {
        return switch(denomination)
        {
            case ONE -> 1.0;
            case TWO -> 2.0;
            case FIVE -> 5.0;
            case TEN -> 10.0;
        };
    }
}
