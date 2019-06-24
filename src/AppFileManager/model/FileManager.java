package AppFileManager.model;

public class FileManager {
    public static final String MUSIC = "Music";
    public static final String IMAGE = "Image";
    public static final String VIDEO = "Video";
    public static final String AUDIO = "Audio";
    public static final String DOCUMENT = "Document";
    public static final String ALL_FILE = "";

    public void showFile(String fileTypes) {
        System.out.println( "Hiển thị tất cả file " + fileTypes);
    }

    public void openFile(File file){
        System.out.println("Mở File " + file.getNameFile() + " bằng " + file.getApp());
    }

    public void deleteFile(File file) {
        System.out.println("Xóa File " + file.getNameFile() + " đường dẫn " + file.getPathFile() + " thành công!");
    }

    public void shareFile(File file, String appName, String recipient) {
        System.out.println("Chia sẻ File " + file.getNameFile() + " tới " + recipient + " qua " + appName + " thành công!");
    }

    public void moveFile(File file, String newPath) {
        String oldPath = file.getPathFile();
        file.setPathFile(newPath);
        System.out.println("Di chuyển File " + file.getNameFile() + " từ " + oldPath + " tới " + file.getPathFile() + " thành công!");
    }

    public void renameFile(File file, String newName) {
        String oldName = file.getNameFile();
        file.setNameFile(newName);
        System.out.println("Đổi tên File " + oldName + " sang " + newName + " thành công!");
    }

    public void detailsFile(File file) {
        System.out.println("Thông tin File" + file.getNameFile() + ": " + file.getSizeFile()+ " " + file.getLocationFile() + " " + file.getPathFile());
    }
}
