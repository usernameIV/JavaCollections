package SetColletion.BasicActions.WordSet;

public class UniqueWordsMain {
    public static void main(String[] args) {

        SetUniqueWords unqWrd = new SetUniqueWords();

        unqWrd.addWord("Hate");
        unqWrd.addWord("Anger");

        System.out.println("Words in set");

        unqWrd.displayWord();
        unqWrd.removeWord("Hate");
        unqWrd.displayWord();

        unqWrd.verifyWord("Anger");

    }
}
