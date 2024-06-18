package MapCollection.SearchMap.WordCount;

public class WordCountMain {


    public static void main(String[] args) {

        WordCount wrd = new WordCount();

        wrd.addWord("Java", 10);
        wrd.addWord("Python", 5);
        wrd.addWord("Ruby", 3);
        wrd.addWord("C#", 11);

        System.out.println("There are "+ wrd.displayWords() + " words!");


    }


}
