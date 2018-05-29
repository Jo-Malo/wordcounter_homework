package com.example.jomalo.wordcounter;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WordCounterTest {

    @Test
    public void canSplitWords(){
        WordCounter wordCounter = new WordCounter();
        assertEquals(4, wordCounter.splitInputIntoSeparateWords("I smell like dog"));
    }
}
