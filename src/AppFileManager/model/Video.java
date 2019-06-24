package AppFileManager.model;

public class Video extends File {

    public Video(String nameFile, String sizeFile, String locationFile, String pathFile) {
        super(nameFile, sizeFile, locationFile, pathFile);
        this.app = "Video Player";
    }
}
