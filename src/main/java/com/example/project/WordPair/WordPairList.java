package com.example.project.WordPair;

import java.util.ArrayList;

public class WordPairList {
    private ArrayList<WordPair> allPairs;

    public static void main(String[] args) {
        String[] phrase = {"the ", "more", "the", "merrier"};
        //WordPairList list = new WordPairList(phrase);
        //allPairs = new WordPairList(phrase);
        WordPairList list = new WordPairList(phrase);
        System.out.println(list.getAllPairs());
        
    }

    public WordPairList(String[] words) {
        
        /* to be implemented in part (a) */
        allPairs = new ArrayList<WordPair>();
        int increment = -1;
        for(int i = 0; i < words.length-1; i++){
            increment = 1;
            while(increment <= words.length-i-1){
                allPairs.add(new WordPair(words[i], words[i+increment]));
                increment++;
            }
        }
    }

    // The method below was added for testing;
    // it was not part of the original FRQ
    public ArrayList<WordPair> getAllPairs() {
        return allPairs;
    }

    public int numMatches() {
        /* to be implemented in part (b) */
        int count = 0;
        for(int i = 0; i < allPairs.size(); i++){
            if(allPairs.get(i).getFirst().equals(allPairs.get(i).getSecond())){
                count++;
            }
        }
        return count;
    }

    // The method below was added for testing;
    // it was not part of the original FRQ
    public String toString() {
        return allPairs.toString();
    }
}
