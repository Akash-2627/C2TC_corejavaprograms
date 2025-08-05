package Encapsulation;

public class Student {
	private int Sid;
	private String Name;
	private float Avg;
	public int getSid() {
		return Sid;
	}
	public void setSid(int sid) {
		Sid = sid;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public float getAvg() {
		return Avg;
	}
	public void setAvg(float avg) {
		Avg = avg;
	}
	@Override
	public String toString() {
		return "Student [Sid=" + Sid + ", Name=" + Name + ", Avg=" + Avg + "]";
	}
}
