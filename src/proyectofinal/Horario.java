package proyectofinal;

import java.util.List;
import java.util.Scanner;

public class Horario {
	private String clave;
	private Profesor profe;
	private UEA uea;
	private String hora;
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	public Profesor getProfe() {
		return profe;
	}
	public void setProfe(Profesor profe) {
		this.profe = profe;
	}
	public UEA getUea() {
		return uea;
	}
	public void setUea(UEA uea) {
		this.uea = uea;
	}
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	public void registro() {
        Scanner scan = new Scanner(System.in);
		System.out.println("Escribe la clave: ");
		this.clave = scan.nextLine();
		System.out.println("Escribe el nombre de la UEA:");
		//busca uea y la asigna
		//this.uea = scan.nextLine();
		System.out.println("Escribe el Profesor que la impartira:");
	//	this.apellidoMaterno = scan.nextLine();
		System.out.println("Escribe el correo:");
		//this.correo = scan.nextLine();
	}
}
