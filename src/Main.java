import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.PriorityQueue;

public class Main {
	public static void main(String[] args) throws IOException {
		try {
			System.out.println("Ingrese el nombre del archivo de texto que contiene la lista de pacientes.");
			Scanner input = new Scanner(System.in);
			File file = new File(input.nextLine());
	        Scanner scanner = new Scanner(file);
			System.out.println("Escoga la implemetacion que desea utilizar:\n1. VectorHeap\n2. PriorityQueue\nDefault: PriorityQueue");
			String respuesta = input.nextLine();
			input.close();
	        if(respuesta.equals("1")) {
	        	/* Programa para la implemetacion con el VectorHeap*/
				VectorHeap<Paciente> listadoPacientes = new VectorHeap<Paciente>();
	        	while (scanner.hasNextLine()){
		            String line = scanner.nextLine();
		            String[] data = line.split(",");
		            Paciente paciente = new Paciente(data[0], data[1], data[2]);
		            listadoPacientes.add(paciente);
		        }
		        scanner.close();
		        System.out.println("Listado de pacientes en orden de prioridad:");
		        int i = 0;
		        while(!listadoPacientes.isEmpty()) {
		        	Paciente paciente = listadoPacientes.remove();
		        	System.out.println(Integer.toString(++i)+": "+paciente.getNombre()+", "+paciente.getSintoma()+", "+paciente.getPrioridad());
		        }
	        }
	        else {
	        	/* Programa para la implemetacion con JavaUtils, PriorityQueue*/
				PriorityQueue<Paciente> listadoPacientes = new PriorityQueue<Paciente>();
	        	while (scanner.hasNextLine()){
		            String line = scanner.nextLine();
		            String[] data = line.split(",");
		            Paciente paciente = new Paciente(data[0], data[1], data[2]);
		            listadoPacientes.add(paciente);
		        }
		        scanner.close();
		        System.out.println("Listado de pacientes en orden de prioridad:");
		        int i = 0;
		        while(!listadoPacientes.isEmpty()) {
		        	Paciente paciente = listadoPacientes.remove();
		        	System.out.println(Integer.toString(++i)+": "+paciente.getNombre()+", "+paciente.getSintoma()+", "+paciente.getPrioridad());
		        }
	        }
		}
		catch(Exception e) {
			System.out.println("Por favor ingresa una direccion valida para el archivo. "+e.toString());
		}
		
	}
}
