package entidades; // Se��o ... - Aula ... (Exerc�cio de fixa��o - Apostila 5a p�g. 18 a 20)

public class Rent {
	
	public String name;
	public String email;
	
	public Rent(String name, String email) {
		this.name = name;
		this.email = email;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	public String toString() {
		return name + ", " + email;
	}
}
