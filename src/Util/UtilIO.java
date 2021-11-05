package Util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
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
}
