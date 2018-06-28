
public class manipulacion_de_cadenas3 {

	public static void main(String[] args) {
		//se comparan los nombre y devolvera true si son iguales
		String nombre1="erick",nombre2="erick";
		System.out.println(nombre1.equals(nombre2));
		//se comparan los nombres y dara falso porque aqui se checan que esten 
		//escritos de igualmanera(se comparan matusculas y minusculas)
		String nombre3="erick",nombre4="ERICK";
		System.out.println(nombre3.equals(nombre4));
		//dara true porque se ignora si estan escritas con mayusculas o minusculas
		String nombre5="erick",nombre6="ERICK";
		System.out.println(nombre5.equalsIgnoreCase(nombre6));
		

	}

}
