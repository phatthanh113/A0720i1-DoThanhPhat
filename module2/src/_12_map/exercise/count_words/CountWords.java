package _12_map.exercise.count_words;

import java.util.Map;
import java.util.TreeMap;

public class CountWords {
    public static void main(String[] args) {
        String string = "hello hello hello ngoc ";
        String word = "hello";
        string.toLowerCase();
        String[] words = string.split(" ");
        Map<String,Integer> myTreeMap = new TreeMap();
        countWord(word, words, myTreeMap);
        countWord("ngoc",words,myTreeMap);
    }

    private static void countWord(String word, String[] words, Map<String, Integer> myTreeMap) {
        int count=0;
        for (int i = 0; i < words.length ; i++) {
            if(words[i].equals(word)){
                myTreeMap.put(word,++count);
            }
        }
        for (String key : myTreeMap.keySet()) {
            System.out.println(key + " - " + myTreeMap.get(key));
        }
    }
}
