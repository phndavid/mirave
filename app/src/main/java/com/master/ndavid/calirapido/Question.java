package com.master.ndavid.calirapido;

import java.util.ArrayList;

/**
 * Created by N.David on 18/09/2015.
 */
public class Question {

    private String type;
    private String color;
    private String question;
    private ArrayList<Answer> optionsAnswers;
    private String explain;
    private int id;

    public Question(int id,String type, String question, ArrayList<Answer> optionsAnswers, String explain, String color){
        this.type = type;
        this.color = color;
        this.question = question;
        this.optionsAnswers = optionsAnswers;
        this.explain = explain;
        this.id = id;
    }
    public String getType(){ return type; }
    public String getColor(){ return color;}
    public String getQuestion(){
        return question;
    }
    public ArrayList<Answer> getOptionsAnswers(){
        return  optionsAnswers;
    }
    public String getExplain(){
        return explain;
    }
    public int getId(){
        return id;
    }
}
