package org.launchcode.java.studio.question;

public class TrueFalse extends Question{
    private boolean isTrue;
    private boolean isFalse;

    public TrueFalse(String question){
        super(question);
    }
    public boolean isCorrect(){
        return true;
    }
}
