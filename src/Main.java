import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		try {
			System.out.println("Ingrese el nombre del archivo de texto que contiene la lista de pacientes.\n");
			Scanner input = new Scanner(System.in);
			File file = new File(input.nextLine());
	        Scanner scanner = new Scanner(file);
	        input.close();
	        while (scanner.hasNextLine()){
	            String line = scanner.nextLine();
	            
	        }
	        scanner.close();
		}
		catch(Exception e) {
			System.out.println("Por favor ingresa una direccion valida para el archivo.");
		}
		
	}
}
