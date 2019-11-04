package com.spartaglobal.JsonQuizChallange;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        QuizDTO quizDTO = new QuizDTO("resources/quiz.json");
        System.out.println(quizDTO.quizGenres());
        //System.out.println(QuizDTO.printWholeThing());
       // System.out.println(QuizDTO.getSport());
    }
}
