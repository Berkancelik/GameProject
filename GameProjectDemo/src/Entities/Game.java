package Entities;

public class Game {
	private int id;
	private String Name;
	private String companyNmae;
	
	
	public Game(int id, String name, double unitPrice, String companyNmae ) {
		super();
		this.id = id;
		Name = name;
		this.companyNmae = companyNmae;
	}
	
	
	
	public Game() {
	}



	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return Name;
	}
	
	public void setName(String name) {
		Name = name;
	}
	

	public void setUnitPrice(double unitPrice) {
	}
	
	public String getCompanyNmae() {
		return companyNmae;
	}
	
	public void setCompanyNmae(String companyNmae) {
		this.companyNmae = companyNmae;
	}
	
	
	
	
	
	

}
