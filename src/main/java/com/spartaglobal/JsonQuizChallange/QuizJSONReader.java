package com.spartaglobal.JsonQuizChallange;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;

public class QuizJSONReader {

    private JSONObject quizJsonDetails;

    public QuizJSONReader(String fileName) {
        try {
            //simple file reader object
            FileReader quizJSON = new FileReader(fileName);

            //deserialising string to object.
            JSONParser jsonParser = new JSONParser();
            Object quizObject = jsonParser.parse(quizJSON);

            //JSON simple needs a cast from object to the JSON simple object of JSONObject
            quizJsonDetails = (JSONObject) quizObject;

        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
    }
    public JSONObject getQuizJsonDetails() {
        return quizJsonDetails;
    }
}
