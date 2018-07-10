package pojo;

public class Refrie {
	private String name;
	private Integer age;
	private String country;
	public String getName() {
		return name;
	}
	
	public void givesFoul()
	{
		System.out.println("Refree gives a foul");
	}
	
	public void allowsSubstitution()
	{
		System.out.println("Refree allows substituion");
	}
	
	public void timeTrack()
	{
		System.out.println("Refree keeps track of time");
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
	
	public String getCountry() {
		return country;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}
	
	

}
