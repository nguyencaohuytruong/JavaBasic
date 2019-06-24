package BaitapOop1.model;

public class GiaoDichDat extends GiaoDich {
    private String loaiDat;
    public static final String A = "A";
    public static final String B = "B";
    public static final String C = "C";



    public GiaoDichDat(String maGiaoDich, String ngayGiaoDich, int donGia, float dienTich, String loaiDat) {
        super(maGiaoDich, ngayGiaoDich, donGia, dienTich);
        this.loaiDat = loaiDat;
        this.thanhTienDat();
    }
    public int getThanhTienDat(){
        return thanhTien;
    }

    private void thanhTienDat(){
        if (loaiDat.equals(A)){
            thanhTien = (int) (dienTich * donGia * 1.5);
            System.out.println("Thành tiền :" + thanhTien );
        }
        if (loaiDat.equals(B) && loaiDat.equals(C)){
            thanhTien = (int) (dienTich *donGia);
            System.out.println("Thành tiền :" + thanhTien);
        }
    }

}
