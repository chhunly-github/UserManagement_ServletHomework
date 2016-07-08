package DTO;

public class Student {

	private int id;
	private String name;
	private String gender;
	private float score;
	
	public Student(int id2, String name2, String gender2, float score2) {
		this.id=id2;
		this.name=name2;
		this.gender=gender2;
		this.score=score2;
	}
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public float getScore() {
		return score;
	}
	public void setScore(float score) {
		this.score = score;
	}
	
	@Override
	public String toString(){
		return this.id+"/"+this.name+"/"+this.gender+"/"+this.score;
	}
}
