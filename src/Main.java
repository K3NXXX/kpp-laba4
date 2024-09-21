import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // завдання 1

        int N = 10;
        char c1 = 'A';
        char c2 = 'B';

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < N; i++) {
            if (i % 2 == 0) {
                result.append(c1);
            } else {
                result.append(c2);
            }
        }

        System.out.println(result.toString());

        // завдання 36
        String text = "Bleach, One Piece and Dotka 2 top!";
        text = text.trim();
        calculateFrequency(text);
    }

    public static void calculateFrequency(String text) {
        Map<Character, Integer> frequencyMap = new HashMap<>();
        int totalChars = text.length();

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        System.out.println("Character : Frequency");

        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            char character = entry.getKey();
            int count = entry.getValue();
            double relativeFrequency = (double) count / totalChars;

            System.out.printf("'%c' : %.4f%n", character, relativeFrequency);
        }
    }
}
