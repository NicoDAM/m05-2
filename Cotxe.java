/**
 * Classe Cotxe.
 * @author Marina
 *
 */
public class Cotxe {
	/** Numero de matricula que s'assignarà al següent objecte cotxe que es crearà.*/
	private static String seguentMatricula = "0000-AAA";
	/** Variable on s'emmagatzema el valor de la matricula creada */
	private String matricula;
	/** Color del cotxe */
	private String color;
	/** 
	 * Constructor sense arguments.
	 * Sense arguments, crea un objecte cotxe de color gris.
	 * 
	 */
	public Cotxe() {
		this("gris");
		System.out.println("Constructor sense paràmetres");
	}
	
	/** 
	 * Constructor que rep el color del vehicle com argument.
	 * Crea un objecte cotxe amb el color que indiquem.
	 * 
	 * @param color Rep el nom del color indicat.
	 * 
	 */
	public Cotxe(String color) {
		System.out.println("Constructor que rep un color");
		this.color = color;
		matricula = creaMatricula();
	}
	
	/**
	 * Generar una matricula.
	 * Assigna el valor de la variable seguentMatricula a la
	 * nova matricula. I augmenta el seu valor per que la següent 
	 * matricula no coincideixi amb la creada anteriorment. 
	 * 
	 * @return Retorna el numero de matricula assignat.
	 * 
	 */
	private String creaMatricula() {
		String novaMatricula = seguentMatricula;
		String[] m = seguentMatricula.split("-");
		int num = Integer.parseInt(m[0]);
		if (num < 9999) {
			num++;
			seguentMatricula = String.format("%04d-%s", num, m[1]);
		} else {
			/**
			 *  Per simplificar s'ha tret aquesta part del codi,
			 * que hauria d'augmentar les lletres de la matrícula cada cop
			 * que s'arriba a 9999 al nombre.
			 * 
			 */
		}
		return novaMatricula;
	}
	/**
	 * 
	 * @return Retorna el color de l'objecte Cotxe creat.
	 */
	public String getColor() {
		return color;
	}
	/**
	 * @return Retorna la matricula de l'objecte Cotxe creat.
	 */
	public String getMatricula() {
		return matricula;
	}
}
