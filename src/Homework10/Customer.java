package Homework10;

// daca userul are suficienti bani in cont va printa noua balanta dupa 
//retrage si mesaje "Please pick your momey!" 
// si "Thank you for using our ATM!", daca user nu are aruncam exceptie si printam stackTrace-ul

public class Customer {
	
	private String name;
	private String adresa;
	private String email;
	
	public Customer(String name, String adresa, String email) {
		
		this.name = name;
		this.adresa = adresa;
		this.email = email;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdresa() {
		return adresa;
	}
	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
