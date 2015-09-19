package com.master.ndavid.calirapido;

import java.util.ArrayList;

/**
 * Created by N.David on 18/09/2015.
 */
public class Trivia {

    private ArrayList<Question> questions;

    public Trivia(){
        questions = new ArrayList<Question>();
        createQuestion();
    }
    public ArrayList<Answer> createOptionsAnswer(Answer a,Answer b,Answer c, Answer d){
        ArrayList<Answer> answers = new ArrayList<Answer>();
        answers.add(a);
        answers.add(b);
        answers.add(c);
        answers.add(d);
        return  answers;
    }
    public  void createQuestion(){
        Answer a = new Answer("Lulada", false);
        Answer b = new Answer("Cholao", false);
        Answer c = new Answer("Agua", false);
        Answer d = new Answer("Pandebono", true);
        ArrayList<Answer> optionsAnswer = createOptionsAnswer(a,b,c,d);
        Question question = new Question(Question.FIAMBRE,"¿Qué se come en Cali?",optionsAnswer);
        questions.add(question);
    }
    public ArrayList<Question> getQuestions(){
        return  questions;
    }



}
