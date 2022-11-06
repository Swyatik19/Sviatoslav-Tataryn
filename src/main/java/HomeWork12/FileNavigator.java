package HomeWork12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FileNavigator {
    public String weyToFile;

    public int sizeBytesFromFile;

    Map<String, ArrayList<FileData>> collectFiles = new HashMap<>();

    public FileNavigator(String weyToFile, int sizeBytesFromFile) {
        this.weyToFile = weyToFile;
        this.sizeBytesFromFile = sizeBytesFromFile;
    }

    public String getWeyToFile() {
        return weyToFile;
    }


    public ArrayList<FileData> add(FileData fileData, String weyToFile) {
        ArrayList<FileData> listFiles = new ArrayList<>();
        if (!fileData.weyFile.equals(weyToFile)) {
            listFiles.add(fileData);
        }
        if (fileData.getWeyFile().equals(weyToFile)) {
            System.out.println("Error: " + System.lineSeparator() + "Wey add file: " + weyToFile
                    + System.lineSeparator() + fileData);
        }
        return listFiles;
    }

    public ArrayList<FileData> find(String weyToFile) {
        return collectFiles.get(weyToFile);
    }

    public List<FileData> filterBySize(int sizeBytesFromFile) {
        ArrayList<FileData> fileDataArrayList = new ArrayList<>();
        for (ArrayList<FileData> dataArrayList : collectFiles.values())
            for (FileData fileData : dataArrayList) {
                if (fileData.size <= sizeBytesFromFile) {
                    fileDataArrayList.add(fileData);
                }
            }
        return fileDataArrayList;
    }

    public void remove(String weyToFile) {
        collectFiles.remove(weyToFile);
    }


    public List<FileData> sortBySize(List<FileData> collectFiles) {
        Collections.sort(collectFiles, new Comparator<FileData>() {
            @Override
            public int compare(FileData o1, FileData o2) {
                return o1.getSize() - o2.getSize();
            }
        });
        return collectFiles;
    }

}
