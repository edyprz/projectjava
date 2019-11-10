package proyectofinal;

import java.io.Serializable;
import java.util.Scanner;

public class Salon implements Serializable {

	private String clave;
	private String ubicacion;
	

	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
    
    public Salon(String clave, String ubicacion) {
		super();
		this.clave = clave;
		this.ubicacion = ubicacion;
	}
    
    public Salon() {
		super();
	}
    
    public void registro() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Escribe el nombre:");
		this.clave = scan.nextLine();
		System.out.println("Escribe la ubicacion:");
		this.ubicacion = scan.nextLine();
	}
	
	public String toString() {
		return clave+" "+ubicacion;
	}
	
}
