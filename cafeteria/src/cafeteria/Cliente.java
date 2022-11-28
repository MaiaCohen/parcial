package cafeteria;

public class Cliente {
	private String nom;

	public Cliente(String nom) {
		super();
		this.nom = nom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Override
	public String toString() {
		return "Cliente [nom=" + nom + "]";
	}
	
	
}
