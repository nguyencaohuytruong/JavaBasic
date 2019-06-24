package AppFileManager;


import AppFileManager.model.*;

public class Main {

    public static void main(String[] args) {
        FileManager fileManager = new FileManager();
        fileManager.showFile(FileManager.ALL_FILE);
        fileManager.showFile(FileManager.MUSIC);
        Audio audio = new Audio("best-song.mp3","20gb","MyFiles","MyFiles/Music");
        fileManager.openFile(audio);
        fileManager.showFile(FileManager.IMAGE);
        Image image = new Image("nice-pic.png", "10gb", "MyFiles", "MyFiles/Image");
        fileManager.openFile(image);
        fileManager.showFile(FileManager.VIDEO);
        Video video = new Video("excited-film.mp4", "30gb", "MyFiles", "MyFiles/Video");
        fileManager.detailsFile(video);
        fileManager.renameFile(video, "best-film.mp4");
        fileManager.moveFile(video,"MyFile/Favorite");
        fileManager.shareFile(video,"Zalo","Nguyệt");
    }
}
