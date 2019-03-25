import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		try {
			VectorHeap<Paciente> listadoPacientes = new VectorHeap<Paciente>();
			System.out.println("Ingrese el nombre del archivo de texto que contiene la lista de pacientes.");
			Scanner input = new Scanner(System.in);
			File file = new File(input.nextLine());
			input.close();
	        Scanner scanner = new Scanner(file);
	        while (scanner.hasNextLine()){
	            String line = scanner.nextLine();
	            String[] data = line.split(",");
	            Paciente paciente = new Paciente(data[0], data[1], data[2]);
	            listadoPacientes.add(paciente);
	        }
	        scanner.close();
	        System.out.println("Listado de pacientes en orden de prioridad:");
	        while(!listadoPacientes.isEmpty()) {
	        	Paciente paciente = listadoPacientes.remove();
	        	System.out.println(paciente.getNombre()+", "+paciente.getSintoma()+", "+paciente.getPrioridad());
	        }
		}
		catch(Exception e) {
			System.out.println("Por favor ingresa una direccion valida para el archivo. "+e.toString());
		}
		
	}
}
