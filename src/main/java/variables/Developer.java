package variables;

/** Clase que representa un empleado de la empresa
 * 
 * @author Luis Rafael Arroyo Caballero
 *
 */

public class Developer {
	
	/** Attributes */
	
	public final static String COMPANY = "EVERIS";
	private final int MAX_EMPLOYEES = 127;
	private static int countEmployees = 0;
	private String name;
	private int countHolidays;
	private int idEmployee;
	
	/** Constructor */
	
	public Developer(String name) {
		setName(name);
		setCountEmployees();
		setCountHolidays(21);
		setIdEmployee(Developer.countEmployees);
	}
	
	/** Metodo encargado de descontar de un empleado los dias de vacaciones utilizados.
	 * 
	 * @author Luis Rafael Arroyo Caballero
	 * @param daysUsed Dias de vacaciones utilizados por un empleado.
	 */
	
	public void goHolidays(int daysUsed) {
		this.setCountHolidays(countHolidays-daysUsed);
	}
	
	/* Getter & Setters */

	public static int getCountEmployees() {
		return countEmployees;
	}

	public static void setCountEmployees() {
		Developer.countEmployees++;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCountHolidays() {
		return countHolidays;
	}

	public void setCountHolidays(int countHolidays) {
		this.countHolidays = countHolidays;
	}

	public int getIdEmployee() {
		return idEmployee;
	}

	public void setIdEmployee(int idEmployee) {
		this.idEmployee = idEmployee;
	}

	public String getCompany() {
		return COMPANY;
	}

	public int getMaxEmployees() {
		return MAX_EMPLOYEES;
	}

	
	

}
