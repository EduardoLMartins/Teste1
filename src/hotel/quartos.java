package hotel;

public class quartos {
	private String name;
	private String email;
	private int numQuarto;

	public quartos(String name, String email, int numQuarto) {
		this.email= email;
		this.name = name;
		this.numQuarto = numQuarto;
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
	public int getNumQuarto() {
		return numQuarto;
	}
	public void setNumQuarto(int numQuarto) {
		this.numQuarto = numQuarto;
	}
	public String toString() {
		return name +", "+ email; 
	}
	
	
}
