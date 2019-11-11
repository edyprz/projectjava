package proyectofinal;

import java.io.Serializable;
import java.util.Scanner;
public class UEA implements Serializable {

	private String claveUea;
	private String nombreUea;
	private String creditos;
	

	
	
	public String getClaveUea() {
		return claveUea;
	}
	public void setClaveUea(String claveUea) {
		this.claveUea = claveUea;
	}
	public String getNombreUea() {
		return nombreUea;
	}
	public void setNombreUea(String nombreUea) {
		this.nombreUea = nombreUea;
	}
	public String getCreditos() {
		return creditos;
	}
	public void setCreditos(String creditos) {
		this.creditos = creditos;
	}
	public String toString() {
		return claveUea+" "+nombreUea+" "+creditos;
	}	
    
    public UEA() {
		super();
	}
	
	public void registro() {
        Scanner scan = new Scanner(System.in);
		System.out.println("Escribe la clave de la uea:");
		this.claveUea = scan.nextLine();
		System.out.println("Escribe el nombre de la UEA :");
		this.nombreUea = scan.nextLine();
		System.out.println("Escribe los creditos:");
		this.creditos = scan.nextLine();
	}

}
