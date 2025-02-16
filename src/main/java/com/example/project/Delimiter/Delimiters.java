package com.example.project.Delimiter;
import java.util.ArrayList;

public class Delimiters {
    /** The open and close delimiters **/
    private String openDel;
    private String closeDel;

    /** Constructs a Delimiters object where open is the open delimiter and close is the
     *  close delimiter.
     *  Precondition: open and close are non-empty strings.
     */
    public Delimiters(String open, String close) {
        openDel = open;
        closeDel = close;
    }

    /** Returns an ArrayList of delimiters from the array tokens, as described in part (a). */
    public ArrayList<String> getDelimitersList(String[] tokens) {
        /* to be implemented in part (a) */
        ArrayList<String> List = new ArrayList<String>();
        for(int i = 0; i < tokens.length; i++){
            if(tokens[i].equals(")") || tokens[i].equals("(")){
                List.add(tokens[i]);
            }else if(tokens[i].substring(0,1).equals("<") && (tokens[i].substring(tokens[i].length()-1)).equals(">")){
                List.add(tokens[i]);
            }
        }
        return List;
    }
    /** Returns true if the delimiters are balanced and false otherwise, as described in part (b).
     *  Precondition: delimiters contains only valid open and close delimiters.
     */
    public boolean isBalanced(ArrayList<String> delimiters) {
        /* to be implemented in part (b) */
        if(delimiters.size()%2!=0){
            return false;
        }
        for(int i = 0; i < delimiters.size()/2; i++){
            if(delimiters.get(i)==delimiters.get(delimiters.size()-1-i)){
                return false;
            }
        }
        return true;
    }
}