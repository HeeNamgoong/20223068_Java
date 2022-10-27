
public class Student {
	private String names; 
	private int scores; 
	
	public Student (String names, int scores) {
		this.names = names;
		this.scores = scores;
	 }

	
	public String getName() {
		return this.names;
	}
	public int getScore() {
		return this.scores;
	}
	
	public void setName(String names) {
		this.names = names;
	}
	
	public void setScore(int scores) {
		this.scores = scores;
	}
}

