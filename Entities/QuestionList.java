/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Entities;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author balnur
 */
public class QuestionList {
    private ArrayList<Question> questions;
    public QuestionList(){
        this.questions = new ArrayList<Question>();
    }

    public static QuestionList getQuestionList(){
        QuestionList list = new QuestionList();

        Question q = new Question();
        q.setQuestionBody("Question1");
        ArrayList<String> ans = new ArrayList<String>();
        ans.add("ans11");
        ans.add("ans12");
        ans.add("ans13");
        ans.add("ans14");
        q.setAnswers(ans);
        q.setCorrectAnswer("ans12");
        list.questions.add(q);

        q = new Question();
        q.setQuestionBody("Question2");
        ans = new ArrayList<String>();
        ans.add("ans21");
        ans.add("ans22");
        ans.add("ans23");
        ans.add("ans24");
        q.setAnswers(ans);
        q.setCorrectAnswer("ans23");
        list.questions.add(q);

        q = new Question();
        q.setQuestionBody("Question3");
        ans = new ArrayList<String>();
        ans.add("ans31");
        ans.add("ans32");
        ans.add("ans33");
        ans.add("ans34");
        q.setAnswers(ans);
        q.setCorrectAnswer("ans31");
        list.questions.add(q);

        return list;
    }

    public static QuestionList getQuestionListRandomly(int size){
        QuestionList list = getQuestionList();
        QuestionList newList = new QuestionList();
        if(size > list.getQuestions().size()){
            size = list.getQuestions().size();
        }
        while (true) {
            int temp = (new Random()).nextInt(list.getQuestions().size());
            if (newList.getQuestions().contains(
                    list.getQuestions().get(temp)) == false) {
                newList.getQuestions().add(list.getQuestions().get(temp));
            }
            if(newList.getQuestions().size() == size){
                break;
            }

        }
        return newList;
    }

    public ArrayList<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(ArrayList<Question> questions) {
        this.questions = questions;
    }
}
