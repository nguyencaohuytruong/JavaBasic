package Baitap1;

public class Me {
    private String name;
    private String hair;
    private float height;
    private float weight;

    public Me(String name, String hair, float height, float weight) {
        this.name = name;
        this.hair = hair;
        this.height = height;
        this.weight = weight;
    }

    public void thucGiac(){
        System.out.println("Thức giấc: ");
    }

    public void diHoc(){
        System.out.println("Đi đến trường");
    }

    public void tanHoc(){
        System.out.println("Về nhà");
    }
    public void diChoi(){
        System.out.println("Chơi game");
    }

    public void tapGym(){
        System.out.println("Tập gym");
    }

    public void giamCan(){
        weight = weight - 0.1f;
        System.out.println("Cân nặng mới:" + weight);
    }

    public void ngu(){
        System.out.println("Đi ngủ");
    }
}
