public class Question {

	private String q, o1,o2,o3,o4,answer;

	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Question(String q, String o1, String o2, String o3, String o4, String answer) {
		super();
		this.q = q;
		this.o1 = o1;
		this.o2 = o2;
		this.o3 = o3;
		this.o4 = o4;
		this.answer = answer;
	}

	public String getQ() {
		return q;
	}

	public String getO1() {
		return o1;
	}

	public String getO2() {
		return o2;
	}

	public String getO3() {
		return o3;
	}

	public String getO4() {
		return o4;
	}

	public String getAnswer() {
		return answer;
	}

	@Override
	public String toString() {
		return q + "a) " + o1 + "b) " + o2 + "c) " + o3 + "d) " + o4;
	}
	
}