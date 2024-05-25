import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExamConsole {
private QuestionDB qdb;
	
	public ExamConsole() throws IOException {
		super();
		// TODO Auto-generated constructor stub
		qdb= new  QuestionDB();
	}

	public void start() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		//code of exam
		// display 10 questions
		int i, score=0;
		Question qu;
		for (i = 0; i <qdb.size()  ; i++) {
			System.out.println("\t\tQuestion No. "+(i+1));
			qu=qdb.get(i);
			
//			qu.display();
			System.out.println(qu);
			// ask user to enter answer
			System.out.println("Enter your answer\t");
			String userAnswer = br.readLine();
			//check answer
			String correctAnswer=qu.getAnswer();
			if(userAnswer.equalsIgnoreCase(correctAnswer))
			{
				System.out.println("\t\tCorrect");
				score++;
			}
			else
			{
				System.out.println("\t\tWrong... Correct answer is "+correctAnswer);				
			}
		}//for
		System.out.println("You scored "+score +" marks ouf of "+qdb.size()+" marks");
		
		
	}//main
}