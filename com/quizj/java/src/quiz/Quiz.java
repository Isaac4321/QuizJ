package quiz;

import java.util.ArrayList;

public class Quiz {

    private ArrayList<Question> questions = new ArrayList<>();



    public Quiz(String quizName) {

    }

    public Quiz(String quizName, boolean isPublic) {

    }

    public void addQuestion(Question question) {
        questions.add(question);
    }

    public void removeQuestion(Question question) {
        if (!questions.contains(question)) {
            System.out.println("Question doesnt exist");
        }
        else {
            questions.remove(question);
        }
    }

    public int numOfQuestions() {
        return questions.size();
    }

}
