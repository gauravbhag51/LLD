package Patterns.Behavioural.State;

public enum Coin {
    ONE(1),
    TWO(2),
    FIVE(5),
    TEN(10);

    private int value;
    Coin(int x){
        this.value = x;
    }

    public int getValue()
    {
        return this.value;
    }

}
