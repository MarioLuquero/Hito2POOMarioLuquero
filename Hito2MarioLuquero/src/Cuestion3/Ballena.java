package Cuestion3;


//java NO soporta herencia m?ltiple. Python s?.
//java se puede heredar una superclass e implementar una interface a la vez
//en java existe implementaci?n m?ltiple
public class Ballena extends Animal{
//todas las clases hijas sobreescriben m?todos de la clase Padre
	public void correr() {
		System.out.println("ballena corriendo");
	}
	
	@Override
	public void nadar() {
		// TODO Auto-generated method stub
		System.out.println("la ballena nada boca arriba");
	}

	@Override
	public String respirar() {
		return "la ballena respira fuera del agua";
	}

	
	
}//cierra Ballena
