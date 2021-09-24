package org.launchcode.java.studio.countingcharacters;

import java.util.HashMap;

/* write a program to count the number of times each character occurs in a string
and then print the results to the console. */


public class Characters {
    public static void main(String[] args) {

        String myString = "If the product of two terms is zero then common sense says at least one of the two terms " +
                "has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics" +
                " into a form that can be factored allowing that side of the equation to equal zero. " +
                "Once you’ve done that, it’s pretty straightforward from there.";

        characterCount(myString);
    }

    public static void characterCount(String myString){
        HashMap<Character, Integer> characterCounter = new HashMap<>();
        char[] charactersInString = myString.toCharArray();
        for( char i: charactersInString ){
            if(characterCounter.containsKey(i)){
               int currentCount = characterCounter.get(i);
               int newCount = currentCount + 1;
               characterCounter.put(i , newCount);
            } else{
                characterCounter.put(i , 1);
            }
        }
        System.out.println(characterCounter);
    }
}
