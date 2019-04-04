package ch.uzh.rackrec.model.gen.nlp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ModifiedStopwordProvider implements IStopWordProvider {

    public boolean isStopWord(String word) {
      return getStopWords().contains(word);
    }

    public List<String> getStopWords() {
        String[] stopWords = {
            "i",
            "me",
            "my",
            "myself",
            "we",
            "our", 
            "ours", 
            "ourselves", 
            "you", 
            "your", 
            "yours", 
            "yourself", 
            "yourselves", 
            "he", 
            "him", 
            "his", 
            "himself", 
            "she", 
            "her", 
            "hers", 
            "herself", 
            "it", 
            "its", 
            "itself", 
            "they", 
            "them", 
            "their", 
            "theirs", 
            "themselves", 
            "what", 
            "who", 
            "whom", 
            "this", 
            "that", 
            "these", 
            "those", 
            "am", 
            "is", 
            "are", 
            "was", 
            "were", 
            "be", 
            "been", 
            "being", 
            "have", 
            "has", 
            "had", 
            "having", 
            "do", 
            "does", 
            "did", 
            "doing", 
            "a",
            "an", 
            "the",
            "and", 
            "but", 
            "because", 
            "as", 
            "at", 
            "by", 
            "with", 
            "about", 
            "against", 
            "into", 
            "through", 
            "during", 
            "above", 
            "up", 
            "down", 
            "in", 
            "out", 
            "on", 
            "off", 
            "over", 
            "under", 
            "again", 
            "further", 
            "here", 
            "there", 
            "why", 
            "how", 
            "both", 
            "few", 
            "more", 
            "most", 
            "other", 
            "such", 
            "no", 
            "only", 
            "own", 
            "same",
            "so", 
            "than", 
            "too", 
            "very", 
            "s",
            "t",
            "can",
            "will",
            "just",
            "don",
            "should"
        };
        List<String> stopWordList = new ArrayList<String>(Arrays.asList(stopWords));
        return stopWordList;
    }
}
