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
public class Main {

    public static void main(String[] args) {
        QuestionList list = QuestionList.getQuestionListRandomly(3);



        

        for (Question q : list.getQuestions()) {
            System.out.println(q.getQuestionBody() + "_"
                    + q.getCorrectAnswer());
        }
    }
}
