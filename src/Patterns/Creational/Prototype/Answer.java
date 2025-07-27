package Patterns.Creational.Prototype;

public class Answer implements IPrototype {
    private String ans;

    public Answer(String ans)
    {
        this.ans = ans;
    }
    public void showAnswer()
    {
        System.out.println(ans);
    }
    public IPrototype clone()
    {
        return new Answer(this.ans + " cloned successfully");
    }
}
