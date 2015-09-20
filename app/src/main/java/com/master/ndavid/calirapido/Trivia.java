package com.master.ndavid.calirapido;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by N.David on 18/09/2015.
 */
public class Trivia {

    private ArrayList<Question> questions;
    private DBHelper dbHelper;
    public Trivia(){
        dbHelper = new DBHelper();
        questions = new ArrayList<Question>();
        createQuestion();
    }

    public  void createQuestion(){
        HashMap<String,String[]> map = dbHelper.getTrivia();
        for (Map.Entry<String, String[]> trivia : map.entrySet()) {
            String key = trivia.getKey();
            String[] value = trivia.getValue();
            ArrayList<Answer> optionsAnswer = new ArrayList<Answer>();
            optionsAnswer.add(new Answer(value[0],true));
            optionsAnswer.add(new Answer(value[1],false));
            optionsAnswer.add(new Answer(value[2],false));
            optionsAnswer.add(new Answer(value[3],false));
            Question question = new Question(Question.FIAMBRE,key,optionsAnswer);
            questions.add(question);
        }
    }
    public ArrayList<Question> getQuestions(){
        return  questions;
    }



}
