package proyectofinal;

import java.io.Serializable;
import java.util.Scanner;

public class Ayudante extends Alumno implements Academico, Serializable{
	
	private String numEconomico;
	
	@Override
	public void registroEmpleado() {
        Scanner scan = new Scanner(System.in);
		System.out.println("Escribe el numero economico:");
		this.numEconomico = scan.nextLine();
	}
	
	@Override
	public String toString() {
		super.toString();
		return getNombre()+" "+getApellidoPaterno()+" "+getApellidoMaterno()+" "+getCorreo()+" "
				+getMatricula()+" "+getCarrera()+" "+numEconomico;
	}

	public Ayudante() {
		super();
	}

	public String getNumEconomico() {
		return numEconomico;
	}

	public void setNumEconomico(String numEconomico) {
		this.numEconomico = numEconomico;
	}
	
}
