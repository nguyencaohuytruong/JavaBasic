package AppEmail;

public class Email {
    private String tieuDe;
    private String nguoiGui;
    private String noiDung;
    private int thoiGianNhan;
    private boolean isRead;

    public Email(String tieuDe, String nguoiGui, String noiDung, int thoiGianNhan, boolean isRead) {
        this.tieuDe = tieuDe;
        this.nguoiGui = nguoiGui;
        this.noiDung = noiDung;
        this.thoiGianNhan = thoiGianNhan;
        this.isRead = isRead;
    }

    public Email(){

    }

    public String getTieuDe() {
        return tieuDe;
    }

    public void setTieuDe(String tieuDe) {
        this.tieuDe = tieuDe;
    }

    public String getNguoiGui() {
        return nguoiGui;
    }

    public void setNguoiGui(String nguoiGui) {
        this.nguoiGui = nguoiGui;
    }

    public String getNoiDung() {
        return noiDung;
    }

    public void setNoiDung(String noiDung) {
        this.noiDung = noiDung;
    }

    public long getThoiGianNhan() {
        return thoiGianNhan;
    }

    public void setThoiGianNhan(int thoiGianNhan) {
        this.thoiGianNhan = thoiGianNhan;
    }

    public boolean getIsRead() {
        return isRead;
    }

    public void setIsRead(boolean isRead) {
        this.isRead = isRead;
    }

    @Override
    public String toString() {
        return  "\n - TIÊU ĐỀ: " + tieuDe +
                "\n - Người gửi: " + nguoiGui +
                "\n - Nội dung: " + noiDung +
                "\n - Thời gian nhận: " + thoiGianNhan +
                "\n - Trạng thái: " + isRead;
    }
}
