public class Main {
    public static void main(String[] args) {

        Person serhii = new Person(12,"Serhii", "Zhuravlov");
        Person vlad = new Person(10,"Serhii", "Zhuravlov");
        Person max = new Person(10,"Serhii", "Zhuravlov");

        CheckForAgeInterceptor checkForAgeInterceptor = new CheckForAgeInterceptor();
        checkForAgeInterceptor.checkForAgeValidation(serhii);
        checkForAgeInterceptor.checkForAgeValidation(vlad);
        checkForAgeInterceptor.checkForAgeValidation(max);

    }
}


































/*import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        Path path = Paths.get("text.txt");
        try (BufferedReader reader = Files.newBufferedReader(path)){
            byte[] bytes = Files.readAllBytes(path);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try (BufferedReader reader = Files.newBufferedReader(path)){
            byte[] bytes = Files.readAllBytes(path);
        String line = reader.readLine();
        System.out.println(line);
    } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}



String fileName = "text.txt";
        String contentToWrite = "Текст для збереження в файлі.";

        // Збереження даних у файл
        saveToFile(fileName, contentToWrite);

        // Зчитування даних з файлу
        String contentRead = readFromFile(fileName);
        System.out.println("Зчитано з файлу: " + contentRead);
    }

    // Метод для збереження даних у файл
    public static void saveToFile(String fileName, String content) {
        try {
            Path filePath = Paths.get(fileName);
            Files.write(filePath, content.getBytes(StandardCharsets.UTF_8));
            System.out.println("Дані збережено у файл: " + fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Метод для зчитування даних з файлу
    public static String readFromFile(String fileName) {
        try {
            Path filePath = Paths.get(fileName);
            List<String> lines = Files.readAllLines(filePath, StandardCharsets.UTF_8);
            StringBuilder content = new StringBuilder();
            for (String line : lines) {
                content.append(line).append("\n");
            }
            return content.toString();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }

 */
