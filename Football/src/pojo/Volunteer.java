package pojo;

public class Volunteer {
	private String name;
	private Integer age;
	
	public void servesSupplements()
	{
		System.out.println("Volunteers serves supplements");
	}
	
	public void fieldWork()
	{
		System.out.println("Volunteers does field work");
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Integer getAge() {
		return age;
	}
	
	public void setAge(Integer age) {
		this.age = age;
	}
		

}
