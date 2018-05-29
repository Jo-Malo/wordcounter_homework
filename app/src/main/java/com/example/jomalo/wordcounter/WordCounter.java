package com.example.jomalo.wordcounter;

public class WordCounter {

    public WordCounter(){}
        public int splitInputIntoSeparateWords(String words){
            int noOfWords = words.split(" ").length;
            return noOfWords;
        }

}
