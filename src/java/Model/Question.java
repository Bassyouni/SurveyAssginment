/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author Bassyouni
 */
public class Question {
    
   private int id;
   private Survey survey;
   private String type;
   private String question;
   private String givenAnswers;
   private boolean isSuspended;
   public ArrayList<Answer> answers;

    public Question(int id, Survey survey, String type, String question, String givenAnswers, boolean isSuspended) {
        this.id = id;
        this.survey = survey;
        this.type = type;
        this.question = question;
        this.givenAnswers = givenAnswers;
        this.isSuspended = isSuspended;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Survey getSurvey() {
        return survey;
    }

    public void setSurvey(Survey survey) {
        this.survey = survey;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getGivenAnswers() {
        return givenAnswers;
    }

    public void setGivenAnswers(String givenAnswers) {
        this.givenAnswers = givenAnswers;
    }

    public boolean isIsSuspended() {
        return isSuspended;
    }

    public void setIsSuspended(boolean isSuspended) {
        this.isSuspended = isSuspended;
    }
   
   
}
