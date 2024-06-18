package MapCollection.BasicActions.Dictionary;

import java.util.Dictionary;

public class DictionaryMain {

    public static void main(String[] args) {

        DictionaryMap dct = new DictionaryMap();

        dct.displayWords();

        dct.putWord("Gay", "  Men who sexually enjoy other men");
        dct.putWord("Circle", "  Something with circle form");
        dct.putWord("Triangle", "  Shape with 3 faces");

        dct.displayWords();

        dct.removeWord("Gay");

        dct.displayWords();
        System.out.println("Word searched:"+ dct.searchWord("Triangle"));
    }
}
