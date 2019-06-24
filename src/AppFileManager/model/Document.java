package AppFileManager.model;

public class Document extends File {

    public Document(String nameFile, String sizeFile, String locationFile, String pathFile) {
        super(nameFile, sizeFile, locationFile, pathFile);
        this.app = "Doc Viewer";
    }
}
