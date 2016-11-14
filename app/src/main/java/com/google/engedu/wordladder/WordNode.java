package com.google.engedu.wordladder;

/**
 * Created by sivagami on 20/10/16.
 */

public class WordNode {
    String word;
    int numSteps;
    WordNode pre;

    public WordNode(String word, int numSteps, WordNode pre){
        this.word = word;
        this.numSteps = numSteps;
        this.pre = pre;
    }
}
