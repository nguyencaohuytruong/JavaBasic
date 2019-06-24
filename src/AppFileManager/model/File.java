package AppFileManager.model;

public class File extends FileManager {
    private String nameFile;
    private String sizeFile;
    private String locationFile;
    private String pathFile;
    protected String app;
    private String fileTypes;


    public File(String nameFile, String sizeFile, String locationFile, String pathFile) {
        this.nameFile = nameFile;
        this.sizeFile = sizeFile;
        this.locationFile = locationFile;
        this.pathFile = pathFile;
    }

    public String getNameFile() {
        return nameFile;
    }

    public String getSizeFile() {
        return sizeFile;
    }

    public String getLocationFile() {
        return locationFile;
    }

    public String getPathFile() {
        return pathFile;
    }

    public String getApp() {
        return app;
    }

    public void setNameFile(String nameFile) {
        this.nameFile = nameFile;
    }


    public void setPathFile(String pathFile) {
        this.pathFile = pathFile;
    }

    public String getFileTypes() {
        return fileTypes;
    }

    public void setFileTypes(String fileTypes) {
        this.fileTypes = fileTypes;
    }

    @Override
    public String toString() {
        return "File{" +
                "nameFile='" + nameFile + '\'' +
                ", sizeFile='" + sizeFile + '\'' +
                ", locationFile='" + locationFile + '\'' +
                ", pathFile='" + pathFile + '\'' +
                ", app='" + app + '\'' +
                ", fileTypes='" + fileTypes + '\'' +
                '}';
    }
}
