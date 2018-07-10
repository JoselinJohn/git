package pojo;

public class Player {
	private Integer weight;
	private String name;
	private Integer jersieno;
	private Integer shoeno;
	private String team;
	
	
	public void kick()
	{
		System.out.println("Player kicks a ball");
	}
	
	public void scoreGoal()
	{
		System.out.println("Player scores a goal");
	}
	
	public void run()
	{
		System.out.println("Player runs to fetch the ball");
	}
	
	public void savesGoal()
	{
		System.out.println("Player saves a goal");
	}
	
	public Integer getWeight() {
		return weight;
	}
	
	public void setWeight(Integer weight) {
		this.weight = weight;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Integer getJersieno() {
		return jersieno;
	}
	
	public void setJersieno(Integer jersieno) {
		this.jersieno = jersieno;
	}
	
	public Integer getShoeno() {
		return shoeno;
	}
	
	public void setShoeno(Integer shoeno) {
		this.shoeno = shoeno;
	}
	
	public String getTeam() {
		return team;
	}
	
	public void setTeam(String team) {
		this.team = team;
	}
	
}
