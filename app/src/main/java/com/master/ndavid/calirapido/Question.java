package com.master.ndavid.calirapido;

import java.util.ArrayList;

/**
 * Created by N.David on 18/09/2015.
 */
public class Question {

    private String type;
    private String question;
    private ArrayList<Answer> optionsAnswers;
    private String explain;

    public Question(String type, String question, ArrayList<Answer> optionsAnswers, String explain){
        this.type = type;
        this.question = question;
        this.optionsAnswers = optionsAnswers;
        this.explain = explain;
    }
    public String getType(){ return type; }
    public String getQuestion(){
        return question;
    }
    public ArrayList<Answer> getOptionsAnswers(){
        return  optionsAnswers;
    }
    public String getExplain(){
        return explain;
    }
}
