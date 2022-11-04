package controlador;

public class Main {

	public static void main(String[] args) {
		int a = 15;
		int b = 22;
		int c = 7;
		
		System.out.println(suma(a,b,c));	
		
		Coche miCoche = new Coche();
		miCoche.sumarPuerta();
		System.out.println("El choche ahora tiene " +miCoche.puertas + " puertas");
		
		}

		public static int suma(int a,int b, int c){
		return a+b+c;
}
}	
class Coche{
	public int puertas = 4;
	
	public void sumarPuerta() {
		this.puertas ++;
	}
}

/*Crear una clase coche.

Dentro de la clase coche, una variable num�rica que almacene el n�mero de puertas que tiene.

Una funci�n que incremente el n�mero de puertas que tiene el coche.

Crear un objeto miCoche en el main y a�adirle una puerta.

Mostrar el n�mero de puertas que tiene el objeto.*/
