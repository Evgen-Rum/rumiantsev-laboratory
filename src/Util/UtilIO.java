package Util;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class UtilIO {
    public static String readFile(String pathToFile) {
        StringBuilder stringBuilder = new StringBuilder();
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(pathToFile))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                stringBuilder.append(line).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringBuilder.toString();
    }
    public static boolean createDirectoryIfNotExist(String directory) {
        try {
            Path path = Paths.get(directory);
            if (Files.notExists(path)){
                Files.createDirectory(path);
            }
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
    public static boolean writeFile(String sb, String newFile) {
        try (FileWriter fileWriter = new FileWriter(newFile)) {
            fileWriter.write(sb);
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
    public static boolean extensionIs(File file, String extension) {
        return file.getName().endsWith(extension);
    }
    public static void copyFiles(String sourceName, String targetDir) {
        createDirectoryIfNotExist(targetDir);
        File folder = new File(sourceName);
        File[] listOfFiles = folder.listFiles();
        Path destDir = Paths.get(targetDir);
        if (listOfFiles != null) {
            for (File file : listOfFiles) {
                try {
                    Files.copy(file.toPath(), destDir.resolve(file.getName()));
                    System.out.println("Files copied successfully.");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } else {
            System.out.println("Error! Files already exists");
        }
    }
}
