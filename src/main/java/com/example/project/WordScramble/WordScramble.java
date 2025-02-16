package com.example.project.WordScramble;
import java.util.ArrayList;
public class WordScramble {
  /** Scrambles a given word.
   *
   *  @param word  the word to be scrambled
   *  @return  the scrambled word (possibly equal to word)
   *
   *  Precondition: word is either an empty string or contains only uppercase letters.
   *  Postcondition: the string returned was created from word as follows:
   *  - the word was scrambled, beginning at the first letter and continuing from left to right
   *  - two consecutive letters consisting of "A" followed by a letter that was not "A" were swapped
   *  - letters were swapped at most once
   */
  public static void main(String[] args) {
    System.out.println(scrambleWord("AARDVARK"));
  }
  public static String scrambleWord(String word) {
      /* to be implemented in part (a) */
      String temp1 = "";
      String temp2 = "";
      String print = word;
      for(int i = 0; i < print.length()-1; i++){
        temp1 = print.substring(i,i+1);
        temp2 = print.substring(i+1, i+2);
        if(temp1.equals("A")&&!temp2.equals(temp1)){
          print = print.substring(0, i) + temp2 + temp1 + print.substring(i+2);
          i++;
        }
      }
      return print;
  }


  /** Modifies wordList by replacing each word with its scrambled
   *  version, removing any words that are unchanged as a result of scrambling.
   *
   *  @param wordList the list of words
   *
   *  Precondition: wordList contains only non-null objects
   *  Postcondition:
   *  - all words unchanged by scrambling have been removed from wordList
   *  - each of the remaining words has been replaced by its scrambled version
   *  - the relative ordering of the entries in wordList is the same as it was
   *    before the method was called
   */
  public static ArrayList<String> scrambleOrRemove(ArrayList<String> wordList) {
      /* to be implemented in part (b) */
      String word = "";
      ArrayList<String> newList = new ArrayList<String>();
      for(int i = 0; i < wordList.size(); i++){
        word = scrambleWord(wordList.get(i));
        if(word!=wordList.get(i)){
          newList.add(word);
        }
      }
      return newList;
  }
}
