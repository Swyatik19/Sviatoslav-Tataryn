package HomeWork12;

public class FileData {
    String nameFile;
    int size;
    String weyFile;

    public FileData(String nameFile, int size, String weyFile) {
        this.nameFile = nameFile;
        this.size = size;
        this.weyFile = weyFile;
    }


    @Override
    public String toString() {
        return "FileData{" +
                "nameFile='" + nameFile + '\'' +
                ", size=" + size +
                ", weyFile='" + weyFile + '\'' +
                '}' + System.lineSeparator();
    }

    public String getNameFile() {
        return nameFile;
    }

    public int getSize() {
        return size;
    }

    public String getWeyFile() {
        return weyFile;
    }
}
