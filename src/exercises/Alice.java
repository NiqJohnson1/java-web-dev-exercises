package exercises;

import java.util.Locale;
import java.util.Scanner;

public class Alice {
    public static void main (String[] args) {
        String sentence =
                "Alice was beginning to get very tired of sitting by her sister on the bank, " +
                "and of having nothing to do: once or twice she had peeped into the book her sister was reading, " +
                "but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice " +
                "'without pictures or conversation?'";
        Scanner input = new Scanner(System.in);
        System.out.println("Please type a word to search: ");
        String searchedWord = input.next();
        String sentenceLowerCase = sentence.toLowerCase();
        Integer index = sentenceLowerCase.indexOf(searchedWord);
        Integer length = searchedWord.length();
        System.out.println(sentenceLowerCase.contains(searchedWord));
        System.out.println("The word is located at index: " + index);
        System.out.println("The length of the searched word " + searchedWord + " is " + length);
        String modifiedSentence = sentenceLowerCase.replace(searchedWord, "");
        System.out.println(modifiedSentence);




    }
}
