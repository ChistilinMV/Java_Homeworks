import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
public class Homework02 {
    public static void main(String[] args) {
        System.out.println(buildString(6, 'a', 'b'));
        String fileName = "file.txt";
        Path path = Paths.get(fileName);
        try {
            if (!Files.exists(path)) Files.createFile(path);
            for (int i = 0; i < 100; i++) {
                Files.write(path, "TEXT".getBytes(), StandardOpenOption.APPEND);
            }
        }
        catch (IOException e) {e.printStackTrace();}
    }
    private static String buildString(int n, char c1, char c2){
        // Дано четное число N (>0) и символы c1 и c2. Написать метод, который вернет строку длины N,
        // которая состоит из чередующихся символов c1 и c2, начиная с c1. (6, 'a', 'b') -> "ababab"
        //String str;
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < n/2; i++) {
            str.append(c1);
            str.append(c2);
        }
        return str.toString();
    }
}