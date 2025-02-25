package VendingMachine.Currency;

public class Note implements Currency {
    private final double value;

    public Note(NoteDenomination denomination)
    {
        this.value = getValueForDenomination(denomination);
    }

    public double getValue() {
        return value;
    }

    private double getValueForDenomination(NoteDenomination denomination)
    {
        return switch(denomination)
        {
            case TEN -> 10.0;
            case FIFTY -> 50.0;
            case HUNDRED -> 100.0;
            case FIVE_HUNDRED -> 500.0;
        };
    }
}
