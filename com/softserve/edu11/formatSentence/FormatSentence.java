package com.softserve.edu11.formatSentence;

//The task involves inputting a sentence of five words through the console. The following actions
//must be performed:
//• Identify the longest word in the sentence and display it on the console.
//• Determine the number of letters in the longest word.
//• Display the second word of the sentence in reverse order on the console.
public class FormatSentence {
    private String[] words;
    private String longestWord;
    private int longestWordLength;

    public FormatSentence(String Sentence) {
        setWords(Sentence.split(" "));
    }

    private void longestWordInArray() {
        int wordLength;

        for (String word : getWords()) {
            wordLength = word.length();

            if (wordLength > getLongestWordLength()) {
                setLongestWord(word);
                setLongestWordLength(wordLength);
            }
        }
    }

    public static String reverseWord(String word) {
        StringBuilder reverse = new StringBuilder(word);
        return reverse.reverse().toString();
    }

    public String[] getWords() {
        return words;
    }

    private void setWords(String[] words) {
        this.words = words;
    }

    public String getLongestWord() {
        longestWordInArray();

        return longestWord;
    }

    private void setLongestWord(String longestWord) {
        this.longestWord = longestWord;
    }

    public int getLongestWordLength() {
        return longestWordLength;
    }

    private void setLongestWordLength(int longestWordLength) {
        this.longestWordLength = longestWordLength;
    }
}
