import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner; 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);       
        System.out.print("Enter your sentence: ");
        String sentence = scanner.nextLine(); 
        String[] wordsArray = sentence.split(" ");
        LinkedHashSet<String> uniqueWords = new LinkedHashSet<>(Arrays.asList(wordsArray));
        String cleanSentence = String.join(" ", uniqueWords);
        System.out.println("Cleaned sentence: " + cleanSentence);
        scanner.close();
    }
}
