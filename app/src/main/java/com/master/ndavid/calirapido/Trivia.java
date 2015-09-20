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
        ArrayList<String[]> trivias = dbHelper.getTrivias();
        for (int i = 0; i < trivias.size(); i++) {
            String[] trivia = trivias.get(i);
            ArrayList<Answer> optionsAnswer = new ArrayList<Answer>();
            optionsAnswer.add(new Answer(trivia[2],true));
            optionsAnswer.add(new Answer(trivia[3],false));
            optionsAnswer.add(new Answer(trivia[4],false));
            optionsAnswer.add(new Answer(trivia[5],false));
            Question question = new Question(trivia[0],trivia[1],optionsAnswer);
            questions.add(question);
        }
    }
    public ArrayList<Question> getQuestions(){
        return  questions;
    }



}
