package MapCollection.BasicActions.Dictionary;

import java.util.HashMap;
import java.util.Map;

public class DictionaryMap {

    private Map<String, String> words;

    public DictionaryMap() {
        this.words = new HashMap<>();
    }


    public void putWord(String word, String meaning){
        words.put(word, meaning);
    }
    public void removeWord(String word) {
        if(!words.isEmpty()) {
            words.remove(word);
        }
    }
    public void displayWords() {
        if (!words.isEmpty()) {
            System.out.println(words);
        }
        else {
            System.out.println("Map is empty bro");
        }
    }
    public String searchWord (String word) {
        String meaningByWord = null;
        if(!words.isEmpty()) {
            meaningByWord = words.get(word);
        }
        return meaningByWord;
    }
}
