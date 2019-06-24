package Game.model;

public class Soldier implements Character {
    private int mucDoAn = 2;

    public void eat() {
        System.out.println("Lính ăn " + mucDoAn + " tấn gạo");
    }

    @Override
    public int checkConsume() {
        return mucDoAn;
    }

    public void phongthu() {
        System.out.println("bảo vệ");
    }
}
