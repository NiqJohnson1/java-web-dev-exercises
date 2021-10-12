package org.launchcode.java.studio.question;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class Question {
   private String questionText;
   private ArrayList<String> answer;


    public Question(String questionText) {
        this.questionText = questionText;
        this.answer = answer;

    }

    public abstract boolean isCorrect();
}
