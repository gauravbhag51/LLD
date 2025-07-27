package StackOverflow;

public class Vote {
    private static int voteCount = 0;
    private final int id;
    private final User author;

    public Vote(User author)
    {
        this.id = voteCount;
        voteCount++;
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public User getAuthor() {
        return author;
    }
}
