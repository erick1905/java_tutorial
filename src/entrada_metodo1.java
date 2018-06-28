import java.util.*;
public class entrada_metodo1 {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
        System.out.println("introduce tu nombre");
        String nombre=entrada.nextLine();
        System.out.println("introduce tu edad");
        int edad=entrada.nextInt();
        System.out.println("hola "+ nombre+" tu edad es de "+edad+" años"
        		+ " y el año que viene tendras;"+(edad+1));
	}

}
