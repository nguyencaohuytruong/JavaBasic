package Game.model;

public class Knight implements Character {
    private String vuKhi;
    private int mucDoAn = 8;
    public static final String GUOM = "gươm";
    public static final String GIAO = "giáo";


    public Knight(String vuKhi) {
        this.vuKhi = vuKhi;
    }

    public void eat() {
        System.out.println("Kỵ sỹ ăn " + mucDoAn + " tấn gạo");
    }

    @Override
    public int checkConsume() {
        return mucDoAn;
    }

    public void tanCong() {
        System.out.println("tấn công bằng " + vuKhi);
    }
}
