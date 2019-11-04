package com.spartaglobal.JsonQuizChallange;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class QuizDTO {
    private static JSONObject quiz;

    public QuizDTO(String fileName) {
        QuizJSONReader quizFileReader = new QuizJSONReader(fileName);
        quiz = quizFileReader.getQuizJsonDetails();
    }

    public String getEntireQuizJSON() {
        return String.valueOf(quiz);
    }

    public String getSportsQuestions() {
        JSONObject quizObject = (JSONObject) quiz.get("quiz");
        JSONObject sportObject = (JSONObject) quizObject.get("sport");
        return sportObject.toString();
    }

    public String getMathsQuestions() {
        JSONObject quizObject = (JSONObject) quiz.get("quiz");
        JSONObject mathsObject = (JSONObject) quizObject.get("maths");
        return mathsObject.toString();
    }

    public JSONArray getSportOptions() {
        JSONObject quizObject = (JSONObject) quiz.get("quiz");
        JSONObject sportObject = (JSONObject) quizObject.get("sport");
        JSONObject q1Object = (JSONObject) sportObject.get("q1");
        return (JSONArray) q1Object.get("options");
    }

    public JSONArray getMathOptionsForQuestion1() {
        JSONObject quizObject = (JSONObject) quiz.get("quiz");
        JSONObject sportObject = (JSONObject) quizObject.get("maths");
        JSONObject q1Object = (JSONObject) sportObject.get("q1");
        return (JSONArray) q1Object.get("options");
    }

    public JSONArray getMathOptionsForQuestion2() {
        JSONObject quizObject = (JSONObject) quiz.get("quiz");
        JSONObject sportObject = (JSONObject) quizObject.get("maths");
        JSONObject q1Object = (JSONObject) sportObject.get("q2");
        return (JSONArray) q1Object.get("options");
    }

    public String getSportQuestion1() {
        JSONObject quizObject = (JSONObject) quiz.get("quiz");
        JSONObject sportObject = (JSONObject) quizObject.get("sport");
        JSONObject sportQ1Object = (JSONObject) sportObject.get("q1");
        return (String) sportQ1Object.get("question");
    }

    public String getMathQuestion1() {
        JSONObject quizObject = (JSONObject) quiz.get("quiz");
        JSONObject mathObject = (JSONObject) quizObject.get("maths");
        JSONObject mathQ1Object = (JSONObject) mathObject.get("q1");
        return (String) mathQ1Object.get("question");
    }

    public String getMathQuestion2() {
        JSONObject quizObject = (JSONObject) quiz.get("quiz");
        JSONObject mathObject = (JSONObject) quizObject.get("maths");
        JSONObject mathQ1Object = (JSONObject) mathObject.get("q2");
        return (String) mathQ1Object.get("question");
    }

    //kierans way of printing the JSON file
    public Map<String, JSONObject> quizGenres() {
        Map<String, JSONObject> quizGenres = new HashMap<>();

        for (Object keyName : quiz.entrySet()) {
            Map.Entry entry = (Map.Entry) keyName;
            quizGenres.put(String.valueOf(entry.getKey()), (JSONObject) entry.getValue());
        }
        return quizGenres;
    }

    public Map<String, JSONObject> getQuestionsNEW(){

    }

}