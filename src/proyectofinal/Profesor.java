package proyectofinal;

import java.io.Serializable;
import java.util.Scanner;

public class Profesor implements Academico, Serializable {

	private String nombre;
	private String apellidoPaterno;
	private String apellidoMaterno;
	private String correo;
	private String numEconomico;
	private String titulo;

	public Profesor() {
		super();
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidoPaterno() {
		return apellidoPaterno;
	}

	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	public String getApellidoMaterno() {
		return apellidoMaterno;
	}

	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getNumEconomico() {
		return numEconomico;
	}

	public void setNumEconomico(String numEconomico) {
		this.numEconomico = numEconomico;
	}

	@Override
	public void registroEmpleado() {
        Scanner scan = new Scanner(System.in);
		System.out.println("Escribe el numero economico:");
		this.numEconomico = scan.nextLine();
		System.out.println("Escribe el titulo:");
		this.titulo = scan.nextLine();
	}

	@Override
	public void registro() {
        Scanner scan = new Scanner(System.in);
		System.out.println("Escribe el nombre:");
		this.nombre = scan.nextLine();
		System.out.println("Escribe el apellido paterno:");
		this.apellidoPaterno = scan.nextLine();
		System.out.println("Escribe el apellido materno:");
		this.apellidoMaterno = scan.nextLine();
		System.out.println("Escribe el correo:");
		this.correo = scan.nextLine();
	}
	
	@Override
	public String toString() {
		return nombre+" "+apellidoPaterno+" "+apellidoMaterno+" "+correo+" "+numEconomico+" "+titulo;
	}
	
}