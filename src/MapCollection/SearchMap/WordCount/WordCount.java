package MapCollection.SearchMap.WordCount;

import java.util.HashMap;
import java.util.Map;

public class WordCount {

    private Map<String,Integer> words;

    public WordCount() {
        this.words = new HashMap<>();
    }

    public void addWord(String word, Integer count) {
        words.put(word, count);
    }
    public void removeWord(String word) {
        if (!words.isEmpty()) {
            words.remove(word);
        }
    }
    public int displayWords() {
        int totalCount = 0;
        for (int count : words.values()) {
            totalCount += count;
        }
        return totalCount;
    }
    public String findMostFrequentWord() {
        String mostFrequentWord = null;;
        Integer wordCount = 0;
        if(!words.isEmpty()) {
            for (Map.Entry<String, Integer> entry : words.entrySet()) {
                if (entry.getValue() > wordCount) {
                    wordCount = entry.getValue();
                    mostFrequentWord = entry.getKey();
                }
            }
        }
        return mostFrequentWord;
    }

}
