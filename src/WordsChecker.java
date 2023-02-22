import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordsChecker {
    protected Set<String> stringSet = new HashSet<>();
    public WordsChecker(String text){
        stringSet.addAll(List.of(text.split("\\P{IsAlphabetic}+")));
    }
    public boolean hasWords(String word){
        return stringSet.contains(word);
    }
}
