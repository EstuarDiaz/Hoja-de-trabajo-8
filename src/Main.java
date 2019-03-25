import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.PriorityQueue;

public class Main {
	public static void main(String[] args) throws IOException {
		try {
			System.out.println("Ingrese el nombre del archivo de texto que contiene la lista de pacientes. (pacientes.txt)");
			Scanner input = new Scanner(System.in);
	        Scanner scanner = new Scanner(new File(input.nextLine()));
			System.out.println("Escoga la implemetacion que desea utilizar:\n1. VectorHeap\n2. PriorityQueue\nDefault: PriorityQueue");
			int i = 0;
	        if(input.nextLine().equals("1")) {
	        	/* Programa para la implemetacion con el VectorHeap*/
				VectorHeap<Paciente> listadoPacientes = new VectorHeap<Paciente>();
	        	while (scanner.hasNextLine()){
		            String[] data = scanner.nextLine().split(",");					// Obtener los datos por cada linea del archivo
		            Paciente paciente = new Paciente(data[0], data[1], data[2]);	// Crear la ficha del paciente
		            listadoPacientes.add(paciente);									// Agregar los pacientes a la lista
		        }
		        System.out.println("Listado de pacientes en orden de prioridad:");
		        while(!listadoPacientes.isEmpty()) {
		        	Paciente paciente = listadoPacientes.remove();					// Obtener el siguiente paciente segun prioridad y mostrarlo
		        	System.out.println(Integer.toString(++i)+": "+paciente.getNombre()+", "+paciente.getSintoma()+", "+paciente.getPrioridad());
		        }
	        }
	        else {
	        	/* Programa para la implemetacion con JavaUtils, PriorityQueue*/
				PriorityQueue<Paciente> listadoPacientes = new PriorityQueue<Paciente>();
	        	while (scanner.hasNextLine()){
		            String[] data = scanner.nextLine().split(",");					// Obtener los datos por cada linea del archivo
		            Paciente paciente = new Paciente(data[0], data[1], data[2]);	// Crear la ficha del paciente
		            listadoPacientes.add(paciente);									// Agregar los pacientes a la lista
		        }
		        System.out.println("Listado de pacientes en orden de prioridad:");
		        while(!listadoPacientes.isEmpty()) {
		        	Paciente paciente = listadoPacientes.remove();					// Obtener el siguiente paciente segun prioridad y mostrarlo
		        	System.out.println(Integer.toString(++i)+": "+paciente.getNombre()+", "+paciente.getSintoma()+", "+paciente.getPrioridad());
		        }
	        }
			input.close();
	        scanner.close();
		}
		catch(Exception e) {
			System.out.println("Por favor ingresa una direccion valida para el archivo. "+e.toString());
		}
		
	}
}