import java.util.ArrayList;
import java.util.HashMap;

public class DictionaryOfManyTranslations {
    private HashMap<String, ArrayList<String>> dictionaryMap;

    public DictionaryOfManyTranslations(){
        this.dictionaryMap = new HashMap<>();
    }

    public void add(String word, String translation){
        //an empty list has to be added for new word if one has not already been added
        this.dictionaryMap.putIfAbsent(word, new ArrayList<>());
        
        //let's first retrieve the list cotaining the translations
        ArrayList<String> translationList = this.dictionaryMap.get(word);
        translationList.add(translation);

        //can also add the the word directly like so
        //this.dictionaryMap.get(word).add(translation);
    
    }

    //returns a list of the translations added for the word. If the word has no translations, the method should return an empty list.
    public ArrayList<String> translate(String word){

        return this.dictionaryMap.getOrDefault(word, new ArrayList<>());

    }

    //removes the word and all its translations from the dictionary.
    public void remove(String word){
        this.dictionaryMap.remove(word);
    }
    
}
