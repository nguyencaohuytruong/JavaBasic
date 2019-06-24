package Game.model;

public class Farmer implements Character {
    private int mucDoAn = 1;
    private int mucDoLam = 10;

    public void eat() {
        System.out.println("Nông dân ăn " + mucDoAn +" tấn gạo");
    }

    @Override
    public int checkConsume() {
        return mucDoAn;
    }

    public void lamRuong() {
        System.out.println("làm " + mucDoLam + " tấn gạo");
    }

    public int checkAdd() {
        return mucDoLam;
    }
}
