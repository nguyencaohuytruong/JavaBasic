package AppFileManager.model;

public class Audio extends File {

    public Audio(String nameFile, String sizeFile, String locationFile, String pathFile) {
        super(nameFile, sizeFile, locationFile, pathFile);
        this.app = "Music Player";
    }
}
