package Game.model;

public class Repository {
    private int riceNumber;

    public Repository() {
        this.riceNumber = 100;
    }

    public void consume(int rice){
        riceNumber = riceNumber  - rice;
    }

    public void add(int rice){
        riceNumber = riceNumber + rice;
    }

    public int check(){
        return riceNumber;
    }
}
