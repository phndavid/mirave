package com.master.ndavid.calirapido;

import java.util.ArrayList;

/**
 * Created by N.David on 18/09/2015.
 */
public class Question {
    public  final static  String FIAMBRE = "fiambre";
    public  final static  String HISTORIA = "historia";
    public  final static  String DEPORTE = "deporte";
    public  final static  String SITIOS_TURISTICOS = "sitios turisticos";

    private String type;
    private String question;
    private ArrayList<Answer> optionsAnswers;

    public Question(String type, String question, ArrayList<Answer> optionsAnswers){
        this.type = type;
        this.question = question;
        this.optionsAnswers = optionsAnswers;
    }
    public String getType(){
        return type;
    }
    public String getQuestion(){
        return question;
    }
    public ArrayList<Answer> getOptionsAnswers(){
        return  optionsAnswers;
    }
}
