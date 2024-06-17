package SetColletion.BasicActions.WordSet;

import java.util.HashSet;
import java.util.Set;

public class SetUniqueWords {

    Set<String> words;

    public SetUniqueWords() {
        this.words = new HashSet<>();
    }
    public void addWord(String word) {
        words.add(word);
    }
    public void removeWord(String word) {
        if (words.contains(word)) {
            words.remove(word);
        }
    }
    public void verifyWord(String word) {
        if (words.contains(word)) {
            System.out.println("We got this word!!");
        }
    }
    public void displayWord() {
        System.out.println(words.toString());
    }

}
