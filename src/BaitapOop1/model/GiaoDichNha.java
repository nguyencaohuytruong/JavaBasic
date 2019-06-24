package BaitapOop1.model;

public class GiaoDichNha extends GiaoDich {
    private String loaiNha;
    private String diaChi;
    public static final String CAOCAP = "Cao cấp";
    public static final String THUONG = "Thường";

    public GiaoDichNha(String maGiaoDich, String ngayGiaoDich, int donGia, float dienTich, String loaiNha, String diaChi) {
        super(maGiaoDich, ngayGiaoDich, donGia, dienTich);
        this.loaiNha = loaiNha;
        this.diaChi = diaChi;
        this.thanhTienNha();
    }
    public int getThanhTienNha(){
        return thanhTien;
    }

    private void thanhTienNha(){
        if (loaiNha.equals(CAOCAP)){
            thanhTien = (int) (dienTich * donGia);
        }
        if (loaiNha.equals(THUONG)){
            thanhTien = (int) (dienTich * donGia * 90/100);
        }
    }
}
