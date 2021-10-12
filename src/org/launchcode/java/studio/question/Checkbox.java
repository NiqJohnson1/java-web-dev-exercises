package org.launchcode.java.studio.question;

import exercises.Array;

import java.util.ArrayList;

public class Checkbox extends Question{
    private ArrayList allChoices;
    private ArrayList correctChoices;



    public Checkbox(String question, ArrayList allChoices, ArrayList correctChoices) {
        super(question);
        this.allChoices = allChoices;
        this.correctChoices = correctChoices;
    }

    public boolean isCorrect(){

        return true;
    }

//    public boolean isCorrect(ArrayList userInput){
//        return userInput.containsAll(correctChoices) && userInput.size() == correctChoices.size();
//
//    }

    public void askQuestion(){

    }

}
