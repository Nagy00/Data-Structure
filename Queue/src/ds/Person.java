package ds;

public class Person {
	
	private String name;	
	private String job;
	public Person(String name, String job) {
		super();
		this.name = name;
		this.job = job;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}

}
