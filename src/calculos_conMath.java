
public class calculos_conMath {
	//math.sqrt para raiz cuadrada
	public static void main(String[] args) {
		double raiz=Math.sqrt(9);
		System.out.println(raiz);
		//math.round para redondear
		float num=6.66F;
		int resultado=Math.round(num);
		System.out.println(resultado);
		//math.pow para elevar a potencias
		
		//numero a elevar
		double a=6;
		//potencia
		double b=3;
		int respuesta=(int)Math.pow(a, b);
		System.out.println(respuesta);
	}
}
