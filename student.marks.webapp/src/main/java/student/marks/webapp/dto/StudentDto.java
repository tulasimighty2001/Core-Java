package student.marks.webapp.dto;

public class StudentDto {
	private int id;
	private String name;
	private int english,maths,sciense,result;
	private double percentage;
	private String grade;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEnglish() {
		return english;
	}
	public void setEnglish(int english) {
		this.english = english;
	}
	public int getMaths() {
		return maths;
	}
	public void setMaths(int maths) {
		this.maths = maths;
	}
	public int getSciense() {
		return sciense;
	}
	public void setSciense(int sciense) {
		this.sciense = sciense;
	}
	public int getResult() {
		return result;
	}
	public void setResult(int result) {
		this.result = result;
	}
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "StudentDto [id=" + id + ", name=" + name + ", english=" + english + ", maths=" + maths + ", sciense="
				+ sciense + ", result=" + result + ", percentage=" + percentage + ", grade=" + grade + "]";
	}
	
	
	
}
