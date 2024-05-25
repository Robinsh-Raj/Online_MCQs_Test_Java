import java.io.IOException;
import java.util.ArrayList;

public class QuestionDB {
	private ArrayList<Question> questionList;
	private QuestionFileService qfs;

	public QuestionDB() throws IOException 
	{
		super();
		qfs=new QuestionFileService ();
		questionList =qfs.getQuestions()	;	//=new ArrayList<Question>();
	}
	int size()
	{
		return questionList.size();
	}
	Question get(int index)
	{
		return questionList.get(index);
	}
}