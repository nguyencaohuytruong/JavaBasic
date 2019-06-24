package AppFileManager.model;

public class Image extends File {

    public Image(String nameFile, String sizeFile, String locationFile, String pathFile) {
        super(nameFile, sizeFile, locationFile, pathFile);
        this.app = "Gallery";
    }
}
