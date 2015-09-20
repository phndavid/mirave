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
        for (Map.Entry<String, String[]> entry : map.entrySet()) {
            String[] value = entry.getValue();

            String key = entry.getKey();


        }
    }
    public ArrayList<Question> getQuestions(){
        return  questions;
    }



}
