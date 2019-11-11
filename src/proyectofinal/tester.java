package proyectofinal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class tester {
	static List<Alumno> listaAlumno = new ArrayList<Alumno>();
	static String archAlumno = "alumno.ser";
	static List<Profesor> listaProfesor = new ArrayList<Profesor>();
	static String archProfesor = "profesor.ser";
	static List<Ayudante> listaAyudante = new ArrayList<Ayudante>();
	static String archAyudante = "ayudante.ser";
	static List<Visitante> listaVisitante = new ArrayList<Visitante>();
	static String archVisitante = "visitante.ser";
	static List<UEA> listaUea = new ArrayList<UEA>();
	static String archUea = "uea.ser";
	static List<Salon> listaSalon = new ArrayList<Salon>();
	static String archSalon = "salon.ser";
	static List<Horario> listaHorario = new ArrayList<Horario>();
	static String archHorario = "horario.ser";
	
	static String mat;
	


	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Serializacion util = new Serializacion();

		
		listaAlumno = util.deserializaLista(archAlumno);
		listaProfesor = util.deserializaLista(archProfesor);
		listaAyudante = util.deserializaLista(archAyudante);
		listaVisitante = util.deserializaLista(archVisitante);
		listaUea = util.deserializaLista(archUea);
		listaSalon = util.deserializaLista(archSalon);
		listaHorario = util.deserializaLista(archHorario);

		
		int opcion, operacion;

		do {
			menuprincipal();

			opcion = scan.nextInt();
			switch(opcion){
				case 1://Alta
						alta();
					break;
				case 2://Buscar
						buscar();
					break;
					
				case 3://Consultar
						consulta();
					break;
				default:
					if(opcion != 4) {
					System.out.println("\n Ingrese un valor valido");
					}
			}
			}while(opcion != 4);
			
            util.serializaLista(archAlumno, listaAlumno);
        	util.serializaLista(archProfesor, listaProfesor);
        	util.serializaLista(archAyudante, listaAyudante);
        	util.serializaLista(archVisitante, listaVisitante);
        	util.serializaLista(archSalon, listaSalon);
        	util.serializaLista(archUea, listaUea);
        	util.serializaLista(archHorario, listaHorario);
        	System.out.println("SERIALIZANDO...");
		
	}

	public static <E> void iterar(List<E> lista) {
		Iterator<E> iter = lista.iterator();
		while (iter.hasNext()) 
			System.out.println(iter.next());
	}
	

public static void menuprincipal() {
	

	System.out.println("\n Menu Principal"+
			"\n ========================" + 
			"\n Seleccione una opcion: "+
			"\n 1.- Dar de alta" + 
			"\n 2.- Buscar registro "+
			"\n 3.- Consulta de registro " +
			"\n 4.- Salir");	
}
public static void desplegarregistro() {
	System.out.println(
			"\n ========================" + 
			"\n Seleccione una opcion: "+
			"\n 1.- Alumno" + 
			"\n 2.- Profesor "+
			"\n 3.- Ayudante " +
			"\n 4.- Visitante"+
			"\n 5.- Salon" +
			"\n 6.- UEA");	
}
public static void opciones() {
	System.out.println(
			"\n ========================" + 
			"\n Seleccione una opcion: "+
			"\n 1.- Actualizar" + 
			"\n 2.- Eliminar "+
			"\n 3.- Salir " );	
}
public static void buscar() {
	int busca,operacion = 0;
	Scanner scan = new Scanner(System.in);
	System.out.println("\n Que quiere buscar?");
	desplegarregistro();
	busca = scan.nextInt();
		switch(busca) {
			case 1://Alumno

					 operacion = 0;

                     System.out.println("Dame la matricula");
                     scan.nextLine();
                     String mat = scan.nextLine();
                     labelal:{
                     Iterator<Alumno> iter = listaAlumno.iterator();
                     while(iter.hasNext()) {
                    	 Alumno elemento = iter.next();
                    	 if(elemento.getMatricula().equalsIgnoreCase(mat)) {
         					System.out.println(listaAlumno.get(listaAlumno.indexOf(elemento)));
                    		 opciones();
         					 operacion = scan.nextInt();
         						switch(operacion) {
         							case 1://Actualiza
         								Alumno actualiza = new Alumno();
         								actualiza.registro();
         								actualiza.registroAlumno();
         								listaAlumno.set(listaAlumno.indexOf(elemento), actualiza);
         								System.out.println(listaAlumno);
         								
         								break;
         							case 2://Elimina
         								listaAlumno.remove(listaAlumno.indexOf(elemento));
         								System.out.println(listaAlumno);
         								break labelal;
         								//break;
         					//		case 3://Agregar Uea al horario
         									//agregahorario();
         								//break;
         							default:
         								break;
         						}
         				}
                     }	 
                     }
                     

				break;
			case 2://Profesor
				 operacion = 0;
                 System.out.println("Dame el numero economico");
                 scan.nextLine();
                 String noeco = scan.nextLine();
                 labelpro:{
                 Iterator<Profesor> iterpro = listaProfesor.iterator();
                 while(iterpro.hasNext()) {
                	 Profesor elemento = iterpro.next();
                	 if(elemento.getNumEconomico().equalsIgnoreCase(noeco)) {
     					System.out.println(listaProfesor.get(listaProfesor.indexOf(elemento)));
                		 opciones();
     					 operacion = scan.nextInt();
     						switch(operacion) {
     							case 1://Actualiza
     								Profesor actualiza = new Profesor();
     								actualiza.registro();
     								actualiza.registroEmpleado();
     								listaProfesor.set(listaProfesor.indexOf(elemento.getNumEconomico()), actualiza);
     								System.out.println(listaProfesor);
     								break;
     							case 2://Elimina
     								listaProfesor.remove(listaProfesor.indexOf(elemento));
     								System.out.println(listaProfesor);
     								break labelpro;
     							default:
     								break;
     						}	
     				}
                 }	 
                 }
				break;
			case 3://Ayudante
				 operacion = 0;
                 System.out.println("Dame el numero economico");
                 scan.nextLine();
                  String noeco2 = scan.nextLine();
                  labelay:{
                 Iterator<Ayudante> iterayu = listaAyudante.iterator();
                 while(iterayu.hasNext()) {
                	 Ayudante elemento = iterayu.next();
                	 if(elemento.getNumEconomico().equalsIgnoreCase(noeco2)) {
     					System.out.println(listaAyudante.get(listaAyudante.indexOf(elemento)));
                		 opciones();
     					 operacion = scan.nextInt();
     						switch(operacion) {
     							case 1://Actualiza
     								Ayudante actualiza = new Ayudante();
     								actualiza.registro();
     								actualiza.registroEmpleado();
     								listaAyudante.set(listaAyudante.indexOf(elemento.getNumEconomico()), actualiza);
     								System.out.println(listaAyudante);
     								break;
     							case 2://Elimina
     								listaAyudante.remove(listaProfesor.indexOf(elemento));
     								System.out.println(listaProfesor);
     								break labelay;
     							default:
     								break;
     						}	
     				}
                 }	 
                 }
				break;
			case 4://Visitante
				 operacion = 0;
                 System.out.println("Dame el nombre");
                 scan.nextLine();
                  String nombre = scan.nextLine();
                  labelvi:{
                 Iterator<Visitante> itervi = listaVisitante.iterator();
                 while(itervi.hasNext()) {
                	 Visitante elemento = itervi.next();
                	 if(elemento.getNombre().equalsIgnoreCase(nombre)) {
     					System.out.println(listaVisitante.get(listaVisitante.indexOf(elemento)));
                		 opciones();
     					 operacion = scan.nextInt();
     						switch(operacion) {
     							case 1://Actualiza
     								Visitante actualiza = new Visitante();
     								actualiza.registro();
     								listaVisitante.set(listaVisitante.indexOf(elemento.getNombre()), actualiza);
     								System.out.println(listaVisitante);
     								break;
     							case 2://Elimina
     								listaVisitante.remove(listaVisitante.indexOf(elemento));
     								System.out.println(listaVisitante);
     								break labelvi;
     							default:
     								break;
     						}	
     				}
                 }	 
                 }
				break;
			case 5://Salon
				 operacion = 0;
                 System.out.println("Dame la clave ");
                 scan.nextLine();
                  String clave = scan.nextLine();
                  labelsal:{
                 Iterator<Salon> itersal = listaSalon.iterator();
                 while(itersal.hasNext()) {
                	 Salon elemento = itersal.next();
                	 if(elemento.getClave().equalsIgnoreCase(clave)) {
     					System.out.println(listaSalon.get(listaSalon.indexOf(elemento)));
                		 opciones();
     					 operacion = scan.nextInt();
     						switch(operacion) {
     							case 1://Actualiza
     								Salon actualiza = new Salon();
     								actualiza.registro();
     								listaSalon.set(listaSalon.indexOf(elemento.getClave()), actualiza);
     								System.out.println(listaSalon);
     								break;
     							case 2://Elimina
     								listaSalon.remove(listaSalon.indexOf(elemento));
     								System.out.println(listaSalon);
     								break labelsal;
     							default:
     								break;
     						}	
     				}
                 }	 
                 }
				break;
			case 6://UEA
				 operacion = 0;
                 System.out.println("Dame la clave");
                 scan.nextLine();
                 String  claves = scan.nextLine();
                 labeluea:{
                 Iterator<UEA> iteruea = listaUea.iterator();
                 while(iteruea.hasNext()) {
                	 UEA elemento = iteruea.next();
                	 if(elemento.getClaveUea().equalsIgnoreCase(claves)) {
     					System.out.println(listaUea.get(listaUea.indexOf(elemento)));
                		 opciones();
     					 operacion = scan.nextInt();
     						switch(operacion) {
     							case 1://Actualiza
     								UEA actualiza = new UEA();
     								actualiza.registro();
     								listaUea.set(listaUea.indexOf(elemento), actualiza);
     								System.out.println(listaUea);
     								break;
     							case 2://Elimina
     								listaUea.remove(listaUea.indexOf(elemento));
     								System.out.println(listaUea);
     								break labeluea;
     							default:
     								break;
     						}	
     				}
                 }	 
                 }
				break;
	}	
}

//public static void agregahorario() {
	
//}

public static void alta () {
	//Alumno a = new Alumno();
	Scanner scan = new Scanner(System.in);
	System.out.println("\n Que quiere dar de alta?");
	desplegarregistro();
	int alta = scan.nextInt();
	switch(alta) {
		case 1://Alumno
        	Alumno a = new Alumno();
        	a.registro();
        	a.registroAlumno();
        	listaAlumno.add(a);
        	System.out.println(a.toString());
        	break;
		case 2://Profesor
        	Profesor p = new Profesor();
        	p.registro();
        	p.registroEmpleado();
        	listaProfesor.add(p);
        	System.out.println(p.toString());
			break;
		case 3://Ayudante
        	Ayudante ayu = new Ayudante();
        	ayu.registro();
        	ayu.registroAlumno();
        	ayu.registroEmpleado();
        	listaAyudante.add(ayu);
        	System.out.println(ayu.toString());
			break;
		case 4://Visitante
        	Visitante v = new Visitante();
        	v.registro();
        	listaVisitante.add(v);
        	System.out.println(v.toString());
			break;
		case 5://Salon
        	Salon sal = new Salon();
        	sal.registro();
            listaSalon.add(sal);
        	System.out.println(sal.toString());  
			break;
		case 6://UEA
            UEA uea = new UEA();
            uea.registro();
            listaUea.add(uea);
        	System.out.println(uea.toString());  
			break;
		default:
			System.out.println("Ingrese un valor valido ");
			break;
	}

}

public static void consulta() {
	Scanner scan = new Scanner(System.in);
	System.out.println("\n Que quiere Consultar?");
	desplegarregistro();
	int consulta = 0;
	 consulta = scan.nextInt();
		switch(consulta) {
			case 1://Alumno
				iterar(listaAlumno);
				break;
			case 2://Pofesor
				iterar(listaProfesor);
				break;
			case 3://Ayudante
				iterar(listaAyudante);
				break;
			case 4://Visitante
				iterar(listaVisitante);
				break;
			case 5://Salon
				iterar(listaSalon);
				break;
			case 6://UEA
				iterar(listaUea);
				break;
			default:
				break;
	}
}
}