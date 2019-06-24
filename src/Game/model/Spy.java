package Game.model;

public class Spy implements Character {
    private int mucDoAn = 3;
    private int TAN_CONG = 1;
    private int PHONG_THU = 2;



    public void eat() {
        System.out.println("Do thám ăn " + mucDoAn + " tấn gạo");
    }

    @Override
    public int checkConsume() {
        return mucDoAn;
    }

    public void doTham(int trangThai) {
        if (trangThai == TAN_CONG){
            System.out.println("có địch tấn công");
        }
        if (trangThai == PHONG_THU){
            System.out.println("có thể tấn công 1 nước");
        }
    }
}
