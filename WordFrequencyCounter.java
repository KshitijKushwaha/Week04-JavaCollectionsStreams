import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class WordFrequencyCounter {

    public static void main(String[] args) throws IOException {
        String fileName = "long-doc.txt";
        File file = new File(fileName);
        
        if (!file.exists()) {
            System.out.println("File not found!");
            return;
        }

        BufferedReader br = new BufferedReader(new FileReader(file));
        Map<String, Integer> map = new HashMap<>();

        String str;
        while ((str = br.readLine()) != null) {
            String[] words = str.split("\\W+"); 
            for (String word : words) {
                if (!word.isEmpty()) {
                    word = word.toLowerCase();
                    map.put(word, map.getOrDefault(word, 0) + 1);
                }
            }
        }
        br.close();

        System.out.println("Word Frequencies:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
