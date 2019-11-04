package com.spartaglobal.JsonQuizChallange;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;


public class AppTest


{
    @Test
    public void getEntireQuizJSONTester(){
        QuizDTO quizDTO = new QuizDTO("resources/quiz.json");
        QuizJSONReader quizJSONReader = new QuizJSONReader("resources/quiz.json");
        Assert.assertEquals(quizJSONReader.getQuizJsonDetails().toString(), quizDTO.getEntireQuizJSON() );
    }

    @Test
    public void checkIfThereIsARightAnswerInOptionsAndCorrectAnswerIsCorrectTest(){

    }
}
