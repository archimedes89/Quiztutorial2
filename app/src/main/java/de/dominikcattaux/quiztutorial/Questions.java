package de.dominikcattaux.quiztutorial;

import java.util.ArrayList;

public class Questions {

    public ArrayList<String[]> questions;

    public Questions()  {
        questions = new ArrayList<>(2);
        fillList();
    }


    public void fillList()  {
        String[] question1 = new String[5];
        question1[0] = "Was ist Java?";
        question1[1] = "objektor. Programmiersprache";
        question1[2] = "Eine Kaffeesorte";
        question1[3] = "EU-Mitgliedsstaat";
        question1[4] = "Fluggesellschaft";

        String[] question2 = new String[5];
        question2[0] = "Mit welcher Programmiersprache arbeitet Android Studio?";
        question2[1] = "Java";
        question2[2] = "C#";
        question2[3] = "Python";
        question2[4] = "Swift";

        questions.add(0,question1);
        questions.add(1,question2);
    }

    public ArrayList<String[]> getQuestions() {
        return questions;
    }
}
