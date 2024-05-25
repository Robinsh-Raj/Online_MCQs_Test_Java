import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class QuestionFileService {

    private String folderName = ".\\questions";

    public QuestionFileService() {
        super();
    }

    ArrayList<Question> getQuestions() throws IOException {
        ArrayList<Question> questionList = new ArrayList<>();
        File folder = new File(folderName);
        File[] listOfFiles = folder.listFiles(); // Get the list of files in the folder
        
        if (listOfFiles != null) {
            for (File file : listOfFiles) {
                if (file.isFile()) {
                    Question question = getQuestion(file);
                    questionList.add(question);
                }
            }
        }
        return questionList;
    }

    Question getQuestion(File file) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line).append("\n");
            }
            return parseQuestionFromString(sb.toString());
        }
    }

    private Question parseQuestionFromString(String questionData) {
        String[] parts = questionData.split("#\n");
        // Assuming the format is: question#option1#option2#option3#option4#answer
        String q = parts[0];
        String o1 = parts[1];
        String o2 = parts[2];
        String o3 = parts[3];
        String o4 = parts[4];
        String ans = parts[5].trim(); // Trim to remove any trailing newline characters before getting the answer
        return new Question(q, o1, o2, o3, o4, ans);
    }
}
