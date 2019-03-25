
public class Paciente implements Comparable <Paciente>{
	private String nombre = "";
	private String sintoma = "";
	private String prioridad = "";
	
	/**
	 * Creator
	 * @param nombre El nombre del paciente
	 * @param sintoma El problema o enfermedad que padece el paciente
	 * @param prioridad Una letra entre A-E que indica el nivel de prioridad
	 */
	public Paciente(String nombre, String sintoma, String prioridad) {
		this.nombre = nombre;
		this.sintoma = sintoma;
		this.prioridad = prioridad;
	}
	
	/**
	 * Compara pacientes con pacientes, dependiendo de su prioridad
	 * @return un entero, de manera similar a compareTo para Strings
	 */
	@Override
	public int compareTo(Paciente o) {
		// TODO Auto-generated method stub
		return this.getPrioridad().compareTo(o.getPrioridad());
	}
	
	/**
	 * Geter del nombre del paciente
	 * @return el nombre del paciente
	 */
	public String getNombre() {
		return this.nombre;
	}
	
	/**
	 * Geter del sintoma del paciente
	 * @return el sintoma del paciente
	 */
	public String getSintoma() {
		return this.sintoma;
	}
	
	/**
	 * Geter de la prioridad del paciente
	 * @return la letra que indica la prioridad del paciente
	 */
	public String getPrioridad() {
		return this.prioridad;
	}
}
